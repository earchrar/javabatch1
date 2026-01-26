import java.util.Scanner;

public class L8controlflow{

    public static void main(String[] args){

        // Control Flow 
        // if , if else
        // switch statement

        // Exercise 1 => if
            int num1 = 10;

            if(num1 == 10){
                System.out.println("Num1 is = 10");
            } 

            if(num1 > 10){
                System.out.println("Num1 Greater than is 10.");
            }

        // Exercise 2 => if else 
            int num2 = 50;

            if(num2 > 50){
                System.out.println("Num2 Greater than is 50");
            }else{
                System.out.println("Num2 Less than is 50");
            }

        // Exercise 3 => if else else if
            int num3 = 100;

            if(num3 > 100){
                System.out.println("Num3 Greater than is 100");
            }else if(num3 < 100){
                System.out.println("Num3 Less than is 100");
            }else{
                System.out.println("Num3 equal to.");
            }

        // Execise 4 => Positive / Negative / Equal / Not Equal

            int num4 = 0;

            if(num4 > 0){
                System.out.println("Positive");
            }else if(num4 < 0){
                System.out.println("Negative");
            }else if(num4 == 0){
                System.out.println("Equal");
            }else{
                System.out.println("Other number 0.");
            }

        // Exercise 1 => switch static 
            String today = "Monday";

            switch(today){

                case "Monday":
                    System.out.print("Monday");
                    break;

                case "Tuesday":
                    System.out.print("Tuesday");
                    break;

                case "Wednesday":
                    System.out.print("Wednesday");
                    break;

                case "Thusday":
                    System.out.print("Thusday");
                    break;

                case "Friday":
                    System.out.print("Friday");
                    break;

                case "Saturday":
                    System.out.print("Saturday");
                    break;

                default:
                    System.out.print("Sunday");
                    break;
            }

        // Exercise 1 => switch dynamtic

            Scanner sca = new Scanner(System.in);
            System.out.print("Enter 1 to 7 : ");
            int num = sca.nextInt();

            switch(num){

                case 1:
                    System.out.print("Monday");
                    break;

                case 2:
                    System.out.print("Tuesday");
                    break;

                case 3:
                    System.out.print("Wednesday");
                    break;

                case 4:
                    System.out.print("Thusday");
                    break;

                case 5:
                    System.out.print("Friday");
                    break;

                case 6:
                    System.out.print("Saturday");
                    break;

                default:
                    System.out.print("Sunday");
                    break;
            }


    }

}