import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.plaf.synth.SynthMenuBarUI;

public class Main{

    public static void main(String[] args){

        // Syntax
        // System.out.print(); left to right
        // System.out.println(); up to down 
        // System.out.printf( , );
        
        // Syntax 
        // import.util.Sacnner; 

        // String = %s  
        // int = %d    
        // float = %.2f 
        // char = %c   

        // System.out.print("hi");
        // System.out.print("hello");

        // System.out.println("hi");
        // System.out.println("hello");

        // exe 1 
        
        // String name = "Java Programming";
        // int age = 33;
        // float a = 1.24f;
        // char b = 'e';

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(a);
        // System.out.println(b);

        // exe 2 
        // String name = "Python Programming";
        // int age = 32;
        // float a = 1.2568f;
        // char b = 'e';

        // System.out.printf("Subject name is %s",name);
        // System.out.println("");
        // System.out.printf("Age name is %d",age);
        // System.out.println("");
        // System.out.printf("A is %.2f",a);
        // System.out.println("");
        // System.out.printf("B is %c",b);

        // Single Printf() 
        // System.out.printf("Subject name is %s",name);
        // System.out.printf("Age is %d",age);
        // System.out.printf("Age is %.2f",a);
        // System.out.printf("Character is %c",b);

        // Multi Printf() 
        // System.out.printf("Subject name is %s. Age is %d. Float is %.2f. Character is %c.",name,age,a,b);

        // exe 1 

        // Object  ( String = nextLine() ) 
        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sca.nextLine();
        // System.out.println("Hello "+name);

        // exe 2 

        // Object  ( Int = nextLineInt())
        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter first number:");
        // int fnumber = sca.nextInt();
        // System.out.print("Enter second number: ");
        // int snumber = sca.nextInt();
        // int result = fnumber + snumber;

        // System.out.println("Result is "+result);

        // Object ( Float = nextFloat())

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter First Float: ");
        // float ffloat = sca.nextFloat();
        // System.out.print("Enter Second Float ");
        // float sfloat = sca.nextFloat();
        // float result = ffloat + sfloat;

        // System.out.println("Result is "+result);

        // Object ( char = .next().charAt(0))

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter Character :");
        // char a = sca.next().charAt(0);
        // System.out.printf("Character is: %c",a);

        // Arithemetic Operators ( additon , subtraction , division , multiple , modulue , increment ++ , decrement -- )

        // int a = 50;
        // int b = 60;
        // int result =a  + b;
        // System.out.println(result);
        // ++result;
        // System.out.println(result);
        // --result;
        // System.out.println(result);

        // Assignment Operators ( = , += , -= , *= , %= )

        // int a = 10;
        // a += 5;
        // System.out.println(a);

        // int b = 10;
        // b -= 5;
        // System.out.println(b);

        // int c = 10;
        // c *= 5;
        // System.out.println(c);

        // int d = 10;
        // d %= 5;
        // System.out.println(d);

        // Comprarsion Operators ( == != < > <= >= )

        // int a = 10;
        // int b = 20;
        // System.out.println(a==b);

        // int c = 10;
        // int d = 20;
        // System.out.println(c!=d);

        // int e = 10;
        // int f = 20;
        // System.out.println(e>f);

        // int g = 10;
        // int h = 20;
        // System.out.println(g>=h);

        // int i = 10;
        // int j = 20;
        // System.out.println(i<j);

        // int k = 10;
        // int l = 20;
        // System.out.println(k<=l);

        // Logical Operator ( && || ! )

        // int a = 10;
        // int b = 20;
        // int c = 30;
        // System.out.println((a<b)&&(a>c));
        // System.out.println((a<b)||(a>c));
        // System.out.println(!(a<b));

        // Control flow 

        // int a = 10;

        // if(a < 10){
        //     System.out.println("Less than 10");
        // }else if(a > 10){
        //     System.out.println("Greater than 10");
        // }else{
        //     System.out.println("Equal 10");
        // }

        // Scanner sca = new Scanner(System.in);
        // System.out.println("Enter Hour :");
        // int hours = sca.nextInt();
        // System.out.println("Enter Hours");
        // int minutes = sca.nextInt();
        // System.out.println("Enter Minutes");
        // int seconds = sca.nextInt();
        // System.out.println("Enter Seconds");

        // int result = (hours * 60 * 60) + (minutes * 60) + (seconds);

        // System.out.printf("Result is = %d",result);

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter First Number");
        // int a = sca.nextInt();
        // System.out.print("Enter Second Number");
        // int b = sca.nextInt();
        // System.out.print("Enter Third Number");
        // int c = sca.nextInt();

        // if(a > b && a > c){
        //     System.out.print("First Number is greater than numbers.");
        // }else if(b > a && b > c){
        //     System.out.print("Second Number is greater than numbers.");
        // }else{
        //     System.out.print("Thrid Number is greater than numbers.");
        // }

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter Base Number = ");// ===> 2
        // int bNum = sca.nextInt();
        // System.out.print("Enter Power Number = ");// ===> 4
        // int pNum = sca.nextInt();
        // int result = 1;

        // for(int a = 1;a <= bNum;a++){
        //     result *= bNum; // ===> result = 8 * 2 /  
        // }

        // System.out.print("Final Result = "+result);

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter Interger Number = ");// 1234
        // int num = sca.nextInt();
        // int count = 0;

        // while(num != 0){
        //     count++;
        //     num /= 10;
        // }
        // System.out.print("Digit Count "+count);// 3

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter Interger Number = ");
        // int num = sca.nextInt();// 2468 1234
        // int result = 0;

        // while(num != 0){
        //     int remainder = num % 10;
        //     result += remainder;
        //     num /= 10;
        // }
        // System.out.print("Sun of all digit is = "+result);// 

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter Interger Number = ");
        // int num = sca.nextInt();// 1234
        // int reverse = 0;

        // while(num != 0){
        //     int remainder = num % 10; 
        //     reverse = reverse * 10 + remainder;
        //     num /= 10;
        // }
        // System.out.println("Sun of all digit is = "+reverse);// 4321

        Scanner sca = new Scanner(System.in);

        int option;
        String rname = "";
        String remail = "";
        String rpassword = "";
        String lemail = "";
        String lpassword = "";

        do{

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Program Exit");
            System.out.print("Enter your option = ");

            option = sca.nextInt();
            sca.nextLine();

            if(option == 1){

                System.out.println("*** Register ***");
                System.out.print("Enter your name = ");
                rname = sca.nextLine();
                System.out.print("Enter you email = ");
                remail = sca.nextLine();
                System.out.print("Enter your password = ");
                rpassword = sca.nextLine();
                System.out.println("Register Succeed.");

            }else if(option == 2){

                System.out.print("Login");

                do{
                    System.out.print("Enter your email = ");
                    lemail = sca.nextLine();
                    System.out.print("Enter your password = ");
                    lpassword = sca.nextLine();

                    if(lemail.equals(remail) && lpassword.equals(rpassword)){
                        System.out.println("Login Success");
                        System.out.println("Welcome "+ rname);
                        break;
                    }else{
                        System.out.println("Your information wrong.");
                    }

                }while(true);
                


            }else if(option == 0){
                System.out.print("Program Exit");
            }

        }while(option != 0);

    
    }

}