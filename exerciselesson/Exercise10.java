import javax.swing.*;

public class Exercise10{

    public static void main(String[] args){

        // Table 
        // 1. Data (Row) 
        // 2. Data (Columns)
        // 3. Create Table => JTable 
        // 4. Jscrollpane => JScrollPane

        // Jframe => Title => Table Data 
        JFrame frame = new JFrame("Table Data");
        frame.setSize(400,300);
        
        // Create Data => Row
        String[][] data = {
            {"1","Java Programming","240000"},
            {"2","Python Programming","280000"},
            {"3","Go Programming","300000"}
        };

        // Column 
        String[] columns = {"Id","Language","Price"};

        // Create Table 
        JTable table = new JTable(data,columns);

        // Add table inside JScrollPane
        JScrollPane scrollpane = new JScrollPane(table);

        frame.add(scrollpane);

        frame.setVisible(true);

    }

}