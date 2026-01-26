import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2{

    public static void main(String[] args){

        JFrame frame = new JFrame("Button Click Example");
        frame.setSize(600,200);

        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame,"Button Clicked.");
            }
        });

        frame.add(button);

        frame.setVisible(true);
        
    }

}