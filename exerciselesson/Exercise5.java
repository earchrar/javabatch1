import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] argus){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Character a to z = ");
        char a = scanner.next().toLowerCase().charAt(0);

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.print("You are vowel.");
        }else if(Character.isLetter(a)){
            System.out.print("You are consonent.");
        }else{
            System.out.print("Invalid Numbers. Please Enter a letter from a to z.");
        }

    }
    
}
