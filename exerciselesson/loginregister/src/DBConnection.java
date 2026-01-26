import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{

    public static Connection getConnection(){
        Connection a = null;

        try{

            a = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java_gui_login",
                "root",
                "Rzarni123@#$"
            );
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return a;
    }

}