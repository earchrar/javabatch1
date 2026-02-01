import java.util.*;
import java.sql.*;

public class UserManagement {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int option;

        do{

            System.out.println("1. Create User");
            System.out.println("2. Read User");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("0. Exit Program \n\n");
            System.out.print("Enter your option = ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1: 
                    createUser(scanner);
                    break;
                case 2:
                    readUser();
                    break;
                case 3: 
                    updateUser(scanner);
                    break;
                case 4: 
                    deleteUser(scanner);
                    break;
                case 0: 
                    System.out.println("Exit Program.");
                    break;
                default: 
                    System.out.print("Invalid Number.");
            }


        }while(option != 0);

        scanner.close();

    }

    private static void createUser(Scanner scanner){
        System.out.println("Enter name = ");
        String name = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        String sql = "INSERT INOT users(name,email,address) VALUES (?,?,?)";
        try(
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ){    

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);

            ps.executeUpdate();

            System.out.println("User Created Successfully.");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void readUser(){
        String sql = "SELECT * FROM users";

        try(
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)
        ){   
            while(rs.next()){
                System.out.println(
                    "ID : " + rs.getInt("id") + 
                    "Name : " + rs.getInt("name") + 
                    "Email : " + rs.getInt("email") + 
                    "Address : " + rs.getInt("address")
                );
            } 
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void updateUser(Scanner scanner){
        System.out.print("Enter user id to update = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name = ");
        String name = scanner.nextLine();

        System.out.print("Enter email = ");
        String email = scanner.nextLine();

        System.out.print("Enter address = ");
        String address = scanner.nextLine();

        String sql = "UPDATE users SET name = ?, email = ?, address = ? WHERE id = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ){

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setInt(4, id);
            int result = ps.executeUpdate();

            if(result > 0){
                System.out.println("User Updated Successfully.");
            }else{
                System.out.println("User Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void deleteUser(Scanner scanner){
        System.out.print("Enter user id to delete = ");
        int id = scanner.nextInt();
        scanner.nextLine();
        String sql = "DELETE FROM users WHERE id = ?";

        try(
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ){

            ps.setInt(1, id);
            int result = ps.executeUpdate();

            if(result > 0){
                System.out.println("User Deleted Successfully.");
            }else{
                System.out.println("User not found");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

// java run 
// javac -cp ".;mysql-connector-j-9.5.0.jar" *.java 
// java -cp ".;mysql-connector-j-9.5.0.jar" UserManagement 


