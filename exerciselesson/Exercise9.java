import javax.swing.*;
import java.awt.*;

public class Exercise9{

    public static void main(String[] args){

        // Menubar 
        // 1. Create Menubar => JMenuBar
        // 2. Menu => JMenu 
        // 3. MenuItem => MenuItem 
        // 4. setJMenuBar => Variable (menubar)

        // frame = title => Visual Studio Code
        JFrame frame = new JFrame("Visual Studio Code");
        frame.setSize(600,300);

        // Create Menubar 
        JMenuBar menubar = new JMenuBar();

        // Menu 
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu selection = new JMenu("Selection");
        JMenu view = new JMenu("View");
        JMenu go = new JMenu("Go");
        JMenu run = new JMenu("Run");

        // MenuItem

        // file
        JMenuItem newtextfile = new JMenuItem("New Text File"); 
        JMenuItem newfile = new JMenuItem("New File"); 
        JMenuItem newwindow = new JMenuItem("New Window"); 
        JMenuItem exit = new JMenuItem("Exit"); 

        // Edit 
        JMenuItem undo = new JMenuItem("Undo"); 
        JMenuItem redo = new JMenuItem("Redo"); 
        JMenuItem cut = new JMenuItem("Cut"); 
        JMenuItem copy = new JMenuItem("Copy"); 
        JMenuItem paste = new JMenuItem("Paste"); 
        JMenuItem find = new JMenuItem("Find"); 
        JMenuItem replace = new JMenuItem("Replace"); 
        JMenuItem findinfile = new JMenuItem("Finds in Files"); 
        JMenuItem replaceinfile = new JMenuItem("Replace in Files"); 
        JMenuItem togglelicom = new JMenuItem("Toggle Line Comment"); 
        JMenuItem toggleblkcom = new JMenuItem("Toggle Block Comment"); 

        file.add(newtextfile);
        file.add(newfile);
        file.add(newwindow);
        file.add(exit);

        edit.add(undo);
        edit.add(redo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(find);
        edit.add(replace);
        edit.add(findinfile);
        edit.add(replaceinfile);
        edit.add(togglelicom);
        edit.add(toggleblkcom);

        menubar.add(file);
        menubar.add(edit);
        menubar.add(selection);
        menubar.add(view);
        menubar.add(go);

        frame.setJMenuBar(menubar);

        exit.addActionListener(e -> System.exit(0));

        frame.setVisible(true);

    }

}