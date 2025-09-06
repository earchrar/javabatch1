import java.util.Scanner;

public class Exercise3 {

    // First Number || Second Number || Third Number = Between Second Number Maxinum Number 
    public static void main(String[] argus){

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter Your First Number = ");
        int fnumber = sca.nextInt();// 10
        System.out.print("Enter Your Second Number = ");
        int snumber = sca.nextInt();// 20
        System.out.print("Enter Your Third Number = ");
        int tnumber = sca.nextInt();// 30

            // true      &&       false          ||      false        &&       true  = 10
        if((fnumber<snumber) && (fnumber>tnumber) || (fnumber>snumber) && (fnumber<tnumber)){
            System.out.print("First Number is maxinum Number.");
            // true      &&       false          ||      false        &&       true  = 20
        }else if((snumber<tnumber) && (snumber>tnumber) || (snumber>tnumber) && (snumber<tnumber)){
            System.out.print("Second Number is maxinum Number.");
        }else{
            // true      &&       false          ||      false        &&       true  = 30
            System.out.print("Thrid Number is maxinum Number.");
        }

    }
    
}
