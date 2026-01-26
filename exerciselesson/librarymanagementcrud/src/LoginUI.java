import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LoginUI extends JFrame {

    JTextField tfUsername = new JTextField();
    JTextField tfEmail = new JTextField();
    JPasswordField pfPassword = new JPasswordField();

    public LoginUI() {
        Uistyle.applyModernLook();

        setTitle("Login | Library System");
        setSize(420, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(new Color(245, 246, 250));

        JLabel title = new JLabel("Welcome Login");
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(18, 20, 0, 18));

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

        JPanel btnPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        btnPanel.setOpaque(false);
        JButton btnLogin = new JButton("Login");
        JButton btnRegister = new JButton("Register");
        btnPanel.add(btnLogin);
        btnPanel.add(btnRegister);

        gc.gridy++;
        card.add(btnPanel, gc);

        JLabel tip = new JLabel("Tip: Use Register if you don't have an account.");
        tip.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        tip.setForeground(new Color(120, 120, 120));
        tip.setBorder(BorderFactory.createEmptyBorder(0, 18, 18, 18));

        root.add(title, BorderLayout.NORTH);
        root.add(wrapCenter(card), BorderLayout.CENTER);
        root.add(tip, BorderLayout.SOUTH);

        setContentPane(root);

        btnLogin.addActionListener(e -> login());
        btnRegister.addActionListener(e -> {
            dispose();
            new RegisterUI().setVisible(true);
        });
    }

    private JPanel wrapCenter(JComponent comp) {
        JPanel p = new JPanel(new GridBagLayout());
        p.setBackground(new Color(245, 246, 250));
        p.setBorder(BorderFactory.createEmptyBorder(10, 18, 10, 18));
        p.add(comp);
        return p;
    }

    private void login() {
        String username = tfUsername.getText().trim();
        String email = tfEmail.getText().trim();
        String password = new String(pfPassword.getPassword());

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter username and email and password.");
            return;
        }

        String sql = "SELECT id FROM users WHERE username=? AND email=? AND password=? ";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Login success!");
                    dispose();

                    // After login -> open LibraryGUI
                    SwingUtilities.invokeLater(() -> new LibraryGUI().setVisible(true));

                } else {
                    JOptionPane.showMessageDialog(this, "Invalid username or email or password.");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginUI().setVisible(true));
    }
}
