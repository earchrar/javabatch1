import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterForm extends JFrame{

    JTextField txtUser,txtEmail;
    JPasswordField txtPass;
    JButton btnRegister;

    public RegisterForm(){

        setTitle("Register");
        setSize(300,250);
        setLayout(null);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(20,20,80,15);
        add(l1);

        txtUser = new JTextField();
        txtUser.setBounds(110,20,150,25);
        add(txtUser);

        JLabel l2 = new JLabel("Email");
        l2.setBounds(20,60,80,25);
        add(l2);

        txtEmail = new JTextField();
        txtEmail.setBounds(110,60,150,25);
        add(txtEmail);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(20,100,80,25);
        add(l3);

        txtPass = new JPasswordField();
        txtPass.setBounds(110,100,150,25);
        add(txtPass);

        btnRegister = new JButton("Register");
        btnRegister.setBounds(90,150,100,30);
        add(btnRegister);

        btnRegister.addActionListener(e -> register());

        setVisible(true);
    }

    void register(){

        try{

            Connection a = DBConnection.getConnection();
            String sql = "INSERT INTO users(username,password,email) VALUES (?,?,?)";
            PreparedStatement ps = a.prepareStatement(sql);

            ps.setString(1, txtUser.getText());
            ps.setString(2, new String(txtPass.getPassword()));
            ps.setString(3,txtEmail.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,"Register Success.");

        }catch(Exception c){
            JOptionPane.showMessageDialog(this,c.getMessage());
        }

    }

    public static void main(String[] args){

        new RegisterForm();

    }
}