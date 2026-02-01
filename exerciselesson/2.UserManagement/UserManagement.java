import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class UserManagement{

    static ArrayList<User> users = new ArrayList<>();
    static int userIdCounter = 1;
    static final String FILE_NAME = "users.json";
    static Gson gson = new Gson();

    public static void main(String[] args){

        loadFromFile(); // Program start မှာ JSON file ကနေ load 

        Scanner scanner = new Scanner(System.in);
        int option;

        do{

            System.out.println(" 1. Create User.");
            System.out.println(" 2. Read User.");
            System.out.println(" 3. Update User by Id.");
            System.out.println(" 4. Delete User by Id.");
            System.out.println(" 0. Program Exist.\n\n");
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
                    SaveToFile();// Program ထဲကနေ Exit မလုပ်ခင်မှာ File ထဲမှာ သွားစေတယ် Save.
                    System.out.println("Exit Program.");
                    break;
                default: 
                    System.out.println("Invalid Program.");
            }

        }while(option != 0);

        scanner.close();

    }

    private static void loadFromFile(){

        try(FileReader reader = new FileReader(FILE_NAME)){
            users = gson.fromJson(reader,new TypeToken<ArrayList<User>>(){}.getType());
            if(users == null){
                users = new ArrayList<>();
            }else{
                for(User u: users){
                    if(u.id >= userIdCounter){
                        userIdCounter = u.id + 1;
                    }
                }
            }
        }catch(IOException e){
            users = new ArrayList<>();
        }

    }

    private static void SaveToFile(){

        try(FileWriter writer = new FileWriter(FILE_NAME)){
            gson.toJson(users, writer);
        }catch(IOException e){
            System.out.println("Error saving data.");
        }

    }

    private static void createUser(Scanner scanner){
        System.out.print("Enter name = ");
        String name = scanner.nextLine();
        System.out.print("Enter Email = ");
        String email = scanner.nextLine();
        System.out.print("Enter Address = ");
        String address = scanner.nextLine();
        User user = new User(userIdCounter++,name,email,address);
        users.add(user);
        SaveToFile();
        System.out.println("User Created Successfully.");
    }

    private static void readUser(){
        if(users.isEmpty()){
            System.out.print("No user Found\n\n");
        }else{
            System.out.print("List of Users = ");
            for(User user:users){
                System.out.println(users);
            }
        }
    }

    private static void updateUser(Scanner scanner){
        System.out.print("Enter user id to update = ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for(User user:users){
            if(user.id == id){
                System.out.print("Enter name = ");
                String name = scanner.nextLine();
                if(!name.isEmpty()) user.name = name;
                System.out.print("Enter Email = ");
                String email = scanner.nextLine();
                if(!email.isEmpty()) user.email = email;
                System.out.print("Enter Address = ");
                String address = scanner.nextLine();
                if(!address.isEmpty()) user.address = address;
                SaveToFile();
                System.out.println("User Updated Successfully.");
                return;
            }
        }
        System.out.print("User not found\n\n");
    }

    private static void deleteUser(Scanner scanner){
        System.out.print("Enter user id to delete = ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for(User user:users){
            if(user.id == id){
                users.remove(user);
                SaveToFile();
                System.out.println("User Deleted Successfully");
                return;
            }
        }
        System.out.print("User not Found\n\n");
    }
    
}


// https://repo1.maven.org/maven2/com/google/code/gson/gson/2.90/gson-2.9.0.jar

// java run 
// javac -cp ".;gson-2.9.0.jar" UserManagement.java User.java 

// javac -cp ".;gson-2.9.0.jar" LibraryManagement.java Book.java 