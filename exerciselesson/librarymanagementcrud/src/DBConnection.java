import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{

    public static Connection getConnection() throws SQLException{
        Connection con = null;
        try{
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java_gui_library",
                "root",
                "Rzarni123@#$"
            );
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

}

// mysql => books 
// CREATE TABLE IF NOT EXISTS books(
//     id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
//     title TEXT NOT NULL,
//     author TEXT NOT NULL,
//     category TEXT NOT NULL,
//     isBorrowed INT NOT NULL DEFAULT 0,
//     borrowerName TEXT DEFAULT '-'
// );

// mysql => users 
// CREATE TABLE IF NOT EXISTS users(
//     id INT PRIMARY KEY AUTO_INCREMENT,
//     username VARCHAR(100) NOT NULL UNIQUE,
//     email VARCHAR(100) NOT NULL UNIQUE,
//     password TEXT NOT NULL,
//     createdAt TEXT DEFAULT SYSDATE()
// );





