import javax.swing.*;

public class GUI4{

    public static void main(String[] args){
        
        JFrame frame = new JFrame("GUI 4");
        frame.setSize(600,200);

        // Create menubar 
        JMenuBar menubar = new JMenuBar();

        // Create menu 
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        // Create menu item 
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        // add menu item into menu 
        file.add(open);
        file.add(exit);

        menubar.add(file);
        menubar.add(edit);

        frame.setJMenuBar(menubar);

        // exit 
        exit.addActionListener(e -> System.exit(0));

        frame.setVisible(true);

    }

}

// JFrame , JTextField , JPasswordField , JButton , JScrollPane