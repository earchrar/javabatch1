import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class RegisterUI extends JFrame {

    JTextField tfUsername = new JTextField();
    JTextField tfEmail = new JTextField();
    JPasswordField pfPassword = new JPasswordField();
    JPasswordField pfConfirm = new JPasswordField();

    public RegisterUI() {
        Uistyle.applyModernLook();

        setTitle("Register | Library System");
        setSize(420, 360);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(new Color(245, 246, 250));

        JLabel title = new JLabel("Create Account");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(18, 30, 0, 30));

        JPanel card = Uistyle.cardPanel();
        card.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(8, 8, 8, 8);
        gc.fill = GridBagConstraints.HORIZONTAL;

        gc.gridx = 0; gc.gridy = 0;
        card.add(new JLabel("Username"), gc);
        gc.gridy++;
        card.add(tfUsername, gc);

        gc.gridy++;
        card.add(new JLabel("Email"), gc);
        gc.gridy++;
        card.add(tfEmail, gc);

        gc.gridy++;
        card.add(new JLabel("Password"), gc);
        gc.gridy++;
        card.add(pfPassword, gc);

        gc.gridy++;
        card.add(new JLabel("Confirm Password"), gc);
        gc.gridy++;
        card.add(pfConfirm, gc);

        JPanel btnPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        btnPanel.setOpaque(false);
        JButton btnRegister = new JButton("Register");
        JButton btnBack = new JButton("Back");
        btnPanel.add(btnRegister);
        btnPanel.add(btnBack);

        gc.gridy++;
        card.add(btnPanel, gc);

        JLabel hint = new JLabel("Password will be stored as plain text (demo).");
        hint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        hint.setForeground(new Color(120, 120, 120));
        hint.setBorder(BorderFactory.createEmptyBorder(0, 18, 18, 18));

        root.add(title, BorderLayout.NORTH);
        root.add(wrapCenter(card), BorderLayout.CENTER);
        root.add(hint, BorderLayout.SOUTH);

        setContentPane(root);

        btnRegister.addActionListener(e -> register());
        btnBack.addActionListener(e -> {
            dispose();
            new LoginUI().setVisible(true);
        });
    }

    private JPanel wrapCenter(JComponent comp) {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBackground(new Color(245, 246, 250));
        p.setBorder(BorderFactory.createEmptyBorder(10, 18, 10, 18));
        p.add(comp);
        return p;
    }

    private void register() {
        String username = tfUsername.getText().trim();
        String email = tfEmail.getText().trim();
        String password = new String(pfPassword.getPassword());
        String confirm  = new String(pfConfirm.getPassword());

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }
        if (!password.equals(confirm)) {
            JOptionPane.showMessageDialog(this, "Password not match.");
            return;
        }
        if (password.length() < 4) {
            JOptionPane.showMessageDialog(this, "Password should be at least 4 characters.");
            return;
        }

        String sql = "INSERT INTO users(username, email, password) VALUES(?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Register success! Please login.");
            dispose();
            new LoginUI().setVisible(true);

        } catch (SQLException e) {
            String msg = (e.getMessage() != null && e.getMessage().toLowerCase().contains("unique"))
                    ? "Username already exists."
                    : e.getMessage();
            JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
