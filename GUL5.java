import javax.swing.*;
import java.io.File;

public class GUL5{

    public static void main (String[] args){

        JFrame frame = new JFrame("JOptionPane");
        frame.setSize(600,200);

        // Show Message Dialog 
        // JOptionPane.showMessageDialog(frame, "Hello, this is a message","Title",1);

        // Show Confirm Dialog
        // int choice = JOptionPane.showConfirmDialog(frame,"Do you want to continue","Confirm",JOptionPane.YES_NO_OPTION);

        // if(choice == JOptionPane.YES_NO_OPTION){
        //     JOptionPane.showMessageDialog(frame, "Yes");
        // }else{
        //     JOptionPane.showMessageDialog(frame, "No");
        // }

        // Show input Dialog 
        // String name = JOptionPane.showInputDialog(frame,"Enter you name");
        // if(name != null){
        //     JOptionPane.showMessageDialog(frame, "Hello "+name);
        // }

        // JFileChooser ( Opening File Dialog ) 
        // Create FileChooser 
        JFileChooser filechooser = new JFileChooser();

        // Show open Dialog 
        int result = filechooser.showOpenDialog(frame);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedfile = filechooser.getSelectedFile();
            JOptionPane.showMessageDialog(frame, "Selected File : "+selectedfile.getAbsolutePath());
        }else{
            JOptionPane.showMessageDialog(frame, "No File Selected.");
        }

        frame.setVisible(true);

    }

}