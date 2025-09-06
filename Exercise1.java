import java.util.Scanner;

public class Exercise1{

    // hours = 3600 / minutes = 60 / second  value = second 
    public static void main(String[] argus){

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter Hours");
        int hours = sca.nextInt();
        System.out.println("Enter Minutes");
        int minutes = sca.nextInt();
        System.out.println("Enter Seconds");
        int seconds = sca.nextInt();

        // Method 1 
        // int result = (hours * 3600) + (minutes * 60) + (seconds);

        // Method 1 
        int result = (hours * 60 * 60) + (minutes * 60) + (seconds);

        // Method 1 
        // System.out.printf("Total Value is Second = %d",result);

        // Method 2 
        System.out.println("Total Value is Second = "+result);

    }

}