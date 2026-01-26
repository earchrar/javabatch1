import javax.swing.*;

public class GUI3{

    public static void main(String[] args){

        JFrame frame = new JFrame("GUI 3");
        frame.setSize(600,200);

        // Sample Data 
        String[][] data = {
            {"1","Java Programming","Sample"},
            {"2","Python Programming","Sample"}
        };

        // Column Name 
        String[] columns = {"ID","Subject","Remark"};

        // Create Table 
        JTable table = new JTable(data,columns);

        // Add table inside a scroll pane 
        JScrollPane scrollpane = new JScrollPane(table);

        frame.add(scrollpane);

        frame.setVisible(true);

    }

}