import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class LibraryGUI extends JFrame {

    JTextField tfTitle = new JTextField();
    JTextField tfAuthor = new JTextField();
    JTextField tfCategory = new JTextField();
    JTextField tfBorrower = new JTextField();

    private DefaultTableModel model = new DefaultTableModel(
        new String[]{"ID", "Title", "Author", "Category", "Status", "Borrower"}, 0
    );

    private JTable table = new JTable(model);

    public LibraryGUI() {

        setTitle("Library Management");
        setSize(900, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Top Form
        JPanel form = new JPanel(new GridLayout(2, 4, 10, 10));
        form.setBorder(BorderFactory.createTitledBorder("Book Info"));

        form.add(new JLabel("Title"));
        form.add(new JLabel("Author"));
        form.add(new JLabel("Category"));
        form.add(new JLabel("Borrower (for Borrow)"));

        form.add(tfTitle);
        form.add(tfAuthor);
        form.add(tfCategory);
        form.add(tfBorrower);

        // Buttons
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update (Selected)");
        JButton btnDelete = new JButton("Delete (Selected)");
        JButton btnBorrow = new JButton("Borrow (Selected)");
        JButton btnReturn = new JButton("Return (Selected)");
        JButton btnRefresh = new JButton("Refresh");

        buttons.add(btnAdd);
        buttons.add(btnUpdate);
        buttons.add(btnDelete);
        buttons.add(btnBorrow);
        buttons.add(btnReturn);
        buttons.add(btnRefresh);

        // Table
        JScrollPane scrollPane = new JScrollPane(table);

        // Layout
        JPanel top = new JPanel(new BorderLayout(10, 10));
        top.add(form, BorderLayout.NORTH);
        top.add(buttons, BorderLayout.CENTER);

        add(top, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Events
        btnAdd.addActionListener(e -> addBook());
        btnUpdate.addActionListener(e -> updateBook());
        btnDelete.addActionListener(e -> deleteBook());
        btnBorrow.addActionListener(e -> borrowBook());
        btnReturn.addActionListener(e -> returnBook());
        btnRefresh.addActionListener(e -> loadBooks());

        // click row -> fill textfields
        table.getSelectionModel().addListSelectionListener(e -> fillFromSelectedRow());

        // Load data
        loadBooks();
    }

    private Integer getSelectedId() {
        int row = table.getSelectedRow();
        if (row == -1) return null;
        return Integer.parseInt(model.getValueAt(row, 0).toString());
    }

    private void fillFromSelectedRow() {
        int row = table.getSelectedRow();
        if (row == -1) return;
        tfTitle.setText(model.getValueAt(row, 1).toString());
        tfAuthor.setText(model.getValueAt(row, 2).toString());
        tfCategory.setText(model.getValueAt(row, 3).toString());

        // borrower field keep as user input
    }

    private void loadBooks() {
        model.setRowCount(0);

        String sql = "SELECT id, title, author, category, isBorrowed, borrowerName FROM books ORDER BY id DESC";

        try(
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        ){

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String category = rs.getString("category");
                int isBorrowed = rs.getInt("isBorrowed");
                String borrower = rs.getString("borrowerName");
                String status = (isBorrowed == 1) ? "Borrowed" : "Available";

                model.addRow(new Object[]{id, title, author, category, status, borrower});

            }

        }catch(SQLException e){
            showError(e);
        }
    }

    private void addBook(){
        
        String title = tfTitle.getText().trim();
        String author = tfAuthor.getText().trim();
        String category = tfCategory.getText().trim();

        if(title.isEmpty() || author.isEmpty() || category.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill Title/Author/Category.");
            return;
        }

        String sql = "INSERT INTO books(title, author, category, isBorrowed, borrowerName) VALUES(?,?,?,0,'-')";

        try(
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
        ){

            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, category);
            ps.executeUpdate();

            clearInputs();
            loadBooks();

        } catch (SQLException e) {
            showError(e);
        }
    }

    private void updateBook() {
        Integer id = getSelectedId();
        if (id == null) {
            JOptionPane.showMessageDialog(this, "Select a row first.");
            return;
        }

        String title = tfTitle.getText().trim();
        String author = tfAuthor.getText().trim();
        String category = tfCategory.getText().trim();

        if (title.isEmpty() || author.isEmpty() || category.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill Title/Author/Category.");
            return;
        }

        String sql = "UPDATE books SET title=?, author=?, category=? WHERE id=?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ){

            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, category);
            ps.setInt(4, id);
            ps.executeUpdate();

            loadBooks();

        } catch (SQLException e) {
            showError(e);
        }
    }

    private void deleteBook() {
        Integer id = getSelectedId();
        if(id == null){
            JOptionPane.showMessageDialog(this, "Select a row first.");
            return;
        }

        int ok = JOptionPane.showConfirmDialog(this, "Delete book ID " + id + "?", "Confirm", JOptionPane.YES_NO_OPTION);

        if (ok != JOptionPane.YES_OPTION) return;

        String sql = "DELETE FROM books WHERE id=?";

        try(
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ){

            ps.setInt(1, id);
            ps.executeUpdate();
            loadBooks();

        } catch (SQLException e) {
            showError(e);
        }
    }

    private void borrowBook() {
        Integer id = getSelectedId();
        if (id == null) {
            JOptionPane.showMessageDialog(this, "Select a row first.");
            return;
        }

        String borrower = tfBorrower.getText().trim();
        if (borrower.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter borrower name.");
            return;
        }

        // check status
        String checkSql = "SELECT isBorrowed FROM books WHERE id=?";
        String borrowSql = "UPDATE books SET isBorrowed=1, borrowerName=? WHERE id=?";

        try(
            Connection con = DBConnection.getConnection()
        ){
            
            try(
                PreparedStatement chk = con.prepareStatement(checkSql)){
                chk.setInt(1, id);
                ResultSet rs = chk.executeQuery();
                if (rs.next() && rs.getInt(1) == 1) {
                    JOptionPane.showMessageDialog(this, "This book is already borrowed.");
                    return;
                }
            }

            try(PreparedStatement ps = con.prepareStatement(borrowSql)) {
                ps.setString(1, borrower);
                ps.setInt(2, id);
                ps.executeUpdate();
            }

            tfBorrower.setText("");
            loadBooks();

        } catch (SQLException e) {
            showError(e);
        }
    }

    private void returnBook() {
        Integer id = getSelectedId();
        if (id == null) {
            JOptionPane.showMessageDialog(this, "Select a row first.");
            return;
        }

        String sql = "UPDATE books SET isBorrowed=0, borrowerName='-' WHERE id=?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ){

            ps.setInt(1, id);
            ps.executeUpdate();
            loadBooks();

        } catch (SQLException e) {
            showError(e);
        }
    }

    private void clearInputs() {
        tfTitle.setText("");
        tfAuthor.setText("");
        tfCategory.setText("");
        tfBorrower.setText("");
    }

    private void showError(Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LibraryGUI().setVisible(true));
    }
}
