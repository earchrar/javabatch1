import java.util.Scanner;

public class L11dowhile{

    public static void main(String[] args){

        // java do while 
        // Exericse 1
            // String input;
            // Scanner sca = new Scanner(System.in);
            // do{
            //     System.out.print("Enter something (type 'exit' to 'quit') = ");
            //     input = sca.nextLine();

            //     if(input.equals("exit")){
            //         break;
            //     }

            // }while(input != "exit");

            Scanner sca = new Scanner(System.in);

            int option;
            String rname = "";
            String remail = "";
            String rpassword = "";
            String lemail = "";
            String lpassword = "";

            do{
                System.out.println("(1). Register");
                System.out.println("(2). Login");
                System.out.println("(3). Program Exit");
                System.out.print("Enter your option = ");

                option = sca.nextInt();
                sca.nextLine();

                if(option == 1){
                    System.out.println("**Register Section**");
                    System.out.print("Enter Your Name = ");
                    rname = sca.nextLine();
                    System.out.print("Enter Your Email = ");
                    remail = sca.nextLine();
                    System.out.print("Enter Your Password = ");
                    rpassword = sca.nextLine();
                    System.out.println("**Register Success");

                }else if(option == 2){
                System.out.println("*Login*");

                    do{
                        System.out.print("Enter your oldemail = ");
                        lemail = sca.nextLine();
                        System.out.print("Enter your oldpassword = ");
                        lpassword = sca.nextLine();

                        if(lemail.equals(remail) && lpassword.equals(rpassword)){
                            System.out.println("Login Success");
                            System.out.println("Welcome "+ rname);
                            break;
                        }else{
                            System.out.println("Your information wrong.");
                        }
                    }while(true);


                }else if(option == 3){
                    System.out.print("Exit");
                    break;
                }else{
                    System.out.println("Invalid option! Try Again.");
                }

            }while(option != 0);


    }

    
}