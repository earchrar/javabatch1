// import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {

    static ArrayList<User> users = new ArrayList<>();
    static int userIdCounter = 1; // Starting user ID

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int option;

        do{

            System.out.println("1. Create User. ");
            System.out.println("2. Read User.");
            System.out.println("3. Update User by ID.");
            System.out.println("4. Delete User by ID.");
            System.out.println("0. Exit");
            System.out.print("Program Start Run ==> Enter you options = ");

            option = scanner.nextInt();

            scanner.nextLine();

            switch(option){
                case 1:
                    // System.out.println("Create User");
                    createUsers(scanner);
                    break;
                case 2:
                    // System.out.println("Read User");
                    readUsers();
                    break;
                case 3: 
                    // System.out.println("Update User");
                    updateUsersById(scanner);
                    break;
                case 4: 
                    // System.out.println("Delete User");
                    deleteUserById(scanner);
                    break;
                case 0:
                    System.out.println("Exit Program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
    
        }while(option != 0);

        scanner.close();

    }

    // CreateUsers = 1 
    private static void createUsers(Scanner scanner){
        System.out.print("Enter Name = ");
        String name = scanner.nextLine();
        System.out.print("Enter Email = ");
        String email = scanner.nextLine();
        System.out.print("Enter Address = ");
        String address = scanner.nextLine();
        User user = new User(userIdCounter++,name,email,address);
        users.add(user);
    }

    // readUsers = 2
    private static void readUsers(){
        if(users.isEmpty()){
            System.out.println("No users found.");
        }else{
            System.out.println("List of Users");

            for(User user: users){
                System.out.println(user);
            }

        }
    }

    // updateUsersById = 3
    private static void updateUsersById(Scanner scanner){
        System.out.print("Enter the User ID to update = ");
        int id = scanner.nextInt();// int close
        scanner.nextLine();

        User userToUpdate = null;
        for(User user: users){

            if(user.id == id){
                userToUpdate = user;
                break;
            }
        }
        if(userToUpdate == null){
            System.out.println("User with ID = " + id + " not found.");
        }else{
            System.out.print("Enter new name = ");
            String newName = scanner.nextLine();
            if(!newName.isEmpty()){
                userToUpdate.name = newName;
            }
            System.out.print("Enter new email = ");
            String newEmail = scanner.nextLine();
            if(!newEmail.isEmpty()){
                userToUpdate.email = newEmail;
            }
            System.out.print("Enter new Address = ");
            String newAddress = scanner.nextLine();
            if(!newEmail.isEmpty()){
                userToUpdate.address = newAddress;
            }
            System.out.println("User updated Successfully");
        }
    }

    // deleteUserById = 4
    private static void deleteUserById(Scanner scanner){
        System.out.print("Enter the User ID to delete = ");
        int id = scanner.nextInt();
        scanner.nextLine();

        User userToDelete = null;

        for(User user: users){
        
            if(user.id == id){
                userToDelete = user;
                break;
            }

        }
        if(userToDelete == null){
            System.out.println("User with ID: " + id + "not found.");
        }else{
            users.remove(userToDelete);
            System.out.println("User Deleted Successfully.");
        }
    }

}
