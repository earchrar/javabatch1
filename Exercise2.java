import java.util.Scanner;

public class Exercise2 {

    // First Number || Second Number ||  Third Number = Greater Than 
    public static void main(String[] argus){

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter First Number is = ");
        int firstnumber = sca.nextInt();
        System.out.print("Enter Second Number is = ");
        int secondnumber = sca.nextInt();
        System.out.print("Enter Third Number is = ");
        int thirdnumber = sca.nextInt();

        // Control Flow 
        if(firstnumber > secondnumber && firstnumber > thirdnumber){
            System.out.print("Frist Number is Greater than.");
        }else if(secondnumber > firstnumber && secondnumber > thirdnumber){
            System.out.print("Second Number is Greater than.");
        }else{
            System.out.print("Thrid Number is Greater than.");
        }
        
    }
    
}
