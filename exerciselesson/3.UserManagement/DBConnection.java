import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{

    private static final String URL = "jdbc:mysql://localhost:3306/user_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Rzarni123@#$";

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(Exception e){
            System.out.print("Database connection error!");
            e.printStackTrace();
            return null;
        }
    }

}