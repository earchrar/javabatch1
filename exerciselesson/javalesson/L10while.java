import java.util.Scanner;

public class L10while{

    public static void main(String[] args){

        //  java while
        // Exercise 1 
        // No 1 
        // No 2 
        // No 3 
        // No 4 

        // int a = 1;
        // while(a <= 4){
        //     System.out.println("No "+a);
        //     a++;
        // } 

        // Exercise 1
            // Scanner sca = new Scanner(System.in);
            // // System.out.print("Enter Number = ");
            // // int num = sca.nextInt();
            // int num = -1;
            // while(num <= 0){
            //     System.out.println("Enter positive number");
            //     num = sca.nextInt();
            // }
            // System.out.print("Thank you");
            // sca.close();

        // Exercise 2 
            // Scanner sca = new Scanner(System.in);
            // while(true){
            //     System.out.print("Enter Name = ");
            //     String name = sca.nextLine();

            //     if(name.equals("quit")){
            //         break;
            //     }
            // }

        // Exercise 3 
            int b = 1;
            while(b <= 6){
                if(b == 3){
                    b++;
                    continue;
                }
                System.out.println(b);
                b++;
            }

    }

}