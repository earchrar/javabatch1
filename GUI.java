import javax.swing.*;
import java.awt.*;

public class GUI{

    public static void main(String[] args){

        // row and column and space 

        // frame = add() / setSize() / set 
        // JFrame / JLabel => frame / label => Panel 
        // JFrame frame = new JFrame("Hello Java");
        // JLabel label = new JLabel("Java Programming");

        // frame.add(label);
        // frame.setSize(400,400); // width and height 
        // frame.setVisible(true);

        JFrame frame = new JFrame("Hello Java");
        frame.setSize(600,200);

                                    // row and column and space 
        JPanel panel = new JPanel(new GridLayout(4,2,7,5));

        panel.add(new JLabel("Name = "));
        panel.add(new JTextField(20));
        panel.add(new JLabel("Email = "));
        panel.add(new JTextField(20));
        panel.add(new JLabel("Password = "));
        panel.add(new JPasswordField(20));
        panel.add(new JButton("Submit"));
        panel.add(new JButton("Cancel"));

        frame.add(panel);

        frame.setVisible(true);


    }

}