import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator (No Extends)");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel label1 = new JLabel("Number 1:");
        JTextField num1 = new JTextField();

        JLabel label2 = new JLabel("Number 2:");
        JTextField num2 = new JTextField();

        JLabel label3 = new JLabel("Result:");
        JTextField result = new JTextField();
        result.setEditable(false);

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        // Add action listeners
        add.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText(String.valueOf(a + b));
        });

        sub.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText(String.valueOf(a - b));
        });

        mul.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText(String.valueOf(a * b));
        });

        div.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            if (b == 0) {
                result.setText("Error: /0");
            } else {
                result.setText(String.valueOf(a / b));
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(num1);

        frame.add(label2);
        frame.add(num2);

        frame.add(label3);
        frame.add(result);

        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);

        frame.setVisible(true);
    }
}



