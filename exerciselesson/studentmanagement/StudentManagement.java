import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.awt.*;
import java.io.*;
import java.sql.*;

public class StudentManagement extends JFrame{

    DefaultTableModel model;
    JTable table;
    JTextField txtSearch;
    int editId = 0;
    String selectedPhotoPath = null;
    
    public StudentManagement(){

        setTitle("Student Management System");
        setSize(950,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnAdd = new JButton("Add");
        JButton btnEdit = new JButton("Edit");
        JButton btnDelete = new JButton("Delete");
        JButton btnView = new JButton("View");
        JButton btnExportAll = new JButton("Export All PDF");
        JButton btnExportSearch = new JButton("Export Serach");

        btnAdd.setBounds(20,20,100,25);
        btnEdit.setBounds(130,20,100,25);
        btnDelete.setBounds(240,20,100,25);
        btnView.setBounds(350,20,100,25);
        btnExportAll.setBounds(460,20,100,25);
        btnExportSearch.setBounds(620,20,100,25);

        add(btnAdd);
        add(btnEdit);
        add(btnDelete);
        add(btnView);
        add(btnExportAll);
        add(btnExportSearch);

        JLabel lblSearch = new JLabel("Search");
        lblSearch.setBounds(780,20,50,25);
        add(lblSearch);

        txtSearch = new JTextField();
        txtSearch.setBounds(830,20,100,25);
        add(txtSearch);

        // id name email gender 
        // JTable with photo
        model = new DefaultTableModel(new String[]{"ID","Photo","Name","Email","Gender"},0){

            public Class<?> getColumnClass(int column){
                
                if(column == 1){
                    return ImageIcon.class;
                }

                return Object.class;

            }
        };

        table = new JTable(model);
        table.setRowHeight(60);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20,60,910,380);
        add(sp);

        btnAdd.addActionListener(e->openForm(false));
        btnEdit.addActionListener(e->openForm(true));

    }

    private void openForm(boolean isEdit){

        JDialog form = new JDialog(this, isEdit ? "Edit Stundent" : "Add Student",true);
        form.setSize(400,500);
        form.setLayout(null);
        form.setLocationRelativeTo(this);

        JLabel lblName = new JLabel("Name = ");
        JTextField txtName = new JTextField();

        JLabel lblEmail = new JLabel("Email = ");
        JTextField txtEmail = new JTextField();

        JLabel lblPassword = new JLabel("Password = ");
        JPasswordField txtPassword = new JPasswordField();

        JLabel lblGender = new JLabel("Gender = ");
        JComboBox<String> cbGender = new JComboBox<>(new String[]{"Male","Female","Other"});

        JLabel lblEducation = new JLabel("Education = ");
        JCheckBox chkBSC = new JCheckBox("B.Sc"), chkMSC = new JCheckBox("M.Sc");

        JLabel lblPhone = new JLabel("Phone = ");
        JTextField txtPhone = new JTextField();

        JLabel lblAddress = new JLabel("Addresss = ");
        JTextArea txtAddress = new JTextArea();
        JScrollPane spAddr = new JScrollPane(txtAddress);

        JLabel lblPhoto = new JLabel("Photo = ");
        JButton btnChoosePhoto = new JButton("Choose Photo");
        JButton btnSave = new JButton("Save");

        // Layout 
        lblName.setBounds(20,20,100,25);
        txtName.setBounds(130,20,200,25);

        lblEmail.setBounds(20,60,100,25);
        txtEmail.setBounds(130,60,200,25);

        lblPassword.setBounds(20,100,100,25);
        txtPassword.setBounds(130,100,200,25);

        lblGender.setBounds(20,140,100,25);
        cbGender.setBounds(130,140,200,25);

        lblEducation.setBounds(20,180,100,25);
        chkBSC.setBounds(130,180,60,25);
        chkMSC.setBounds(130,180,60,25);

        lblPhone.setBounds(20,220,100,25);
        txtPhone.setBounds(130,220,200,25);

        lblAddress.setBounds(20,260,100,25);
        spAddr.setBounds(130,260,200,25);

        lblPhoto.setBounds(130,330,100,100);
        btnChoosePhoto.setBounds(240,360,120,30);
        btnSave.setBounds(140,450,100,30);

        form.add(lblName); form.add(txtName);

        form.add(lblEmail); form.add(txtEmail);

        form.add(lblPassword); form.add(txtPassword);

        form.add(lblGender); form.add(cbGender);

        form.add(lblEducation); form.add(chkBSC); form.add(chkMSC);

        form.add(lblPhone); form.add(txtPhone);

        form.add(lblAddress); form.add(spAddr);

        form.add(lblPhoto);

        form.add(btnChoosePhoto);

        form.add(btnSave);

        if(isEdit){

            int r = table.getSelectedRow();

            if(r == -1){
                JOptionPane.showMessageDialog(this, "Select a Student");
                return;
            }

            editId = (int) model.getValueAt(r, 0);

            try{

                Connection con = DB.getConnection();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE id = ?");

                ps.setInt(1, editId);

                ResultSet rs = ps.executeQuery();

                if(rs.next()){
                    txtName.setText(rs.getString("name"));
                    txtEmail.setText(rs.getString("email"));
                    txtPassword.setText(rs.getString("password"));
                    cbGender.setSelectedItem(rs.getString("gender"));
                    String edu = rs.getString("education");
                        chkBSC.setSelected(edu.contains("B.Sc"));
                        chkMSC.setSelected(edu.contains("M.Sc"));
                    txtPhone.setText(rs.getString("phone"));
                    txtAddress.setText(rs.getString("address"));

                    selectedPhotoPath = rs.getString("photo_path");

                    if(selectedPhotoPath != null && new File(selectedPhotoPath).exists()){
                        Image img = new ImageIcon(selectedPhotoPath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                        lblPhoto.setIcon(new ImageIcon(img));
                    }
                }

                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }

        }


    }

    public static void main(String[] args){
        new StudentManagement().setVisible(true);
    }

}