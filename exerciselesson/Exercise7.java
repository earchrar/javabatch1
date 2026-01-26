import java.util.Scanner;

public class Exercise7{

    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);

        String product = "";
        int price = 0;
        int option;

        do{

            System.out.println("Program Insert / Update / Delete / Show / Exit");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Show Data");
            System.out.println("0. Exit");
            System.out.print("Enter you option = ");

            option = sca.nextInt();
            

            if(option == 1){

                sca.nextLine();

                System.out.print("Enter your product = ");
                product = sca.nextLine();
                System.out.print("Enter your price = ");
                price = sca.nextInt();
                System.out.println("Enter you product = "+product);
                System.out.println("Enter you price = "+price);

            }else if(option == 2){

                sca.nextLine();
                System.out.print("Enter your newproduct = ");
                String newproduct = sca.nextLine();
                System.out.print("Enter your newprice = ");
                int newprice = sca.nextInt();

                product = newproduct;
                price = newprice;

                System.out.println("New Product = "+product);
                System.out.println("New Price = "+price);

            }else if(option == 3){

                if(product.isEmpty() || price.isEmpty()){
                    System.out.println("No Data to Delete");
                }else{
                    product = "";
                    price = 0;
                    System.out.println("Delete Data");
                }

            }else if(option == 4){

                System.out.println("Show Product = "+product);
                System.out.println("Show Price = "+price);

                System.out.println("Show Data");

            }else if(option == 0){
                
                System.out.println("Program Exit");
            }


        }while(option != 0);
    }

}