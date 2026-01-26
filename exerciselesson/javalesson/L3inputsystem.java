import java.util.Scanner;
import java.util.InputMismatchException;

public class L3inputsystem{

    public static void main(String[] args){

        // Method => next() 
        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter you fullname = ");
        // String fullname = sca.next();
        // System.out.println(fullname);

        // String = nextLine() 
        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter you fullname = ");
        // String fullname = sca.nextLine();
        // System.out.println(fullname);// Dynamic Name

        // int => nextInt() 
        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter you age = ");
        // int age = sca.nextInt();
        // System.out.println(age);// Dynamic Age

        // float = nextFloat() 
        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter you float = ");
        // float ftnum = sca.nextFloat();
        // System.out.println(ftnum);// Dynamic Float

        // char = next().charAt(0) 
        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter you Character = ");
        // char cha = sca.next().charAt(0);
        // System.out.println(cha);// Dynamic Float

        // double = nextDouble()
        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter you Double = ");
        // double db = sca.nextDouble();
        // System.out.println(db);

        // Exercise 1
        // String / int / float / char 

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter your fullname = ");
        // String name = sca.nextLine();
        // System.out.print("Enter your age = ");
        // int age = sca.nextInt();
        // System.out.print("Enter your Float Number = ");
        // float ftnum = sca.nextFloat();
        // System.out.print("Enter your Character = ");
        // char cha = sca.next().charAt(0);

        // // println() 
        // System.out.println("My Fullname is = "+name);
        // System.out.println("My age is = "+age);
        // System.out.println("My Float Number is = "+ftnum);
        // System.out.println("My Character a to z is = "+cha);

        // sca.close();

        // printf() 
        // System.out.printf("My Fullname is %s. My age is %d. My Float Number is %.2f. My Character a to z is %c",name,age,ftnum,cha);

        // Exercise 2
        Scanner sca = new Scanner(System.in); 
        try{
            System.out.print("Enter Age = ");
            int age = sca.nextInt();
            System.out.printf("My age is = %d",age);
        }catch(InputMismatchException error){
            System.out.print("Please Enter a valid integer !");
        }

        sca.close();

    }

}

// L3inputsystem Note Library 
// import java.util.Scanner(inputsystem) 
// import java.util.InputMismatchException မှားလားမှန်လား စစ်တယ်
// String = nextLine() || int = nextInt() || float = nextFloat() || char = next().charAt(0) || Method = next() 