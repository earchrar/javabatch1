import java.util.Scanner;
public class Day {
    public static void main (String[] args){
   


    Scanner sca = new Scanner (System.in);
    int option;
    String rname = "";
    String remail = "";
    String rpassword ="";
    String lemail = "";
    String lpassword = "";


    do{
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("0. Program exit");
        System.out.print("Enter your option:");
        option = sca.nextInt();
         sca.nextLine();

        if(option == 1){
            sca.nextLine();
            System.out.println("Register");
            System.out.print("Enter your name: ");
            rname = sca.nextLine();
            System.out.print("Enter your email: ");
            remail = sca.nextLine();
            System.out.print("Enter password: ");
            rpassword = sca.nextLine();

        
        }else if(option == 2){
            System.out.println("Login");
            do{
                System.out.print("Enter your email:  ");
                lemail = sca.nextLine();
                System.out.print("Enter your password:  ");
                lpassword = sca.nextLine();
                if(lemail.equals(remail) && lpassword.equals(rpassword)){
                    System.out.println("Login success.");
                    System.out.println("welcome "+ rname);
                    break;
                }else{
                    System.out.println("Your information wrong!");

                }
            }while(true);
        
        }else if(option == 0){
            System.out.println("Program Exit");
        
        }

    }while(option != 0);
}

/* 
String[] name = new String[];
name[0]="Mg Mg";
name[1]= "Aung Aung";
name[2]= "Hla Hla";
name[3]= "Ma Ma";
System.out.print(name[2]);


/*String[] name = {"Aung Aung", "Mg Mg", "Mya Mya","Hla Hla"};
System.out.print(name[3]);

String[] name = new String[3];
name[0]="Mg Mg";
name[1]= "Aung Aung";
System.out.print(name[2]);

String[] name = {"Aung Aung", "Mg Mg","Hla Hla"};
for(int a=0; a < name.length; a++){
    System.out.println(name[a]);

    String[] name = {"Aung Aung", "Mg Mg","Hla Hla"};
for(int a= name.length-1; a >=0; a--){
    System.out.println(name[a]);

    String[] name = {"Aung Aung", "Mg Mg","Hla Hla"};
    for(String a: name){
        System.out.println(a);*/

        /*int[][][]a= {
            {
                {1,2,3},
                {11,22,33}
            },
            {
                {4,5,6}
            },
            {
                {7,8,9}
            }
        };
        System.out.print(a[0][1][2]);*/
        
        
        /*int[][]a={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
            for(int b=0 ; b < a.length ; b++){
            for(int c = 0; c < a.length ; c++){
                System.out.println(a[b][c]);
            }
            System.out.println("");
        
    }*/




    /* int[][]a={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
            for(int b=a.length-1 ; b >=0 ; b--){
            for(int c = 0; c < a.length ; c++){
                System.out.println(a[b][c]);
            }
            System.out.println("");
        
    }*/

   /* int[][]a={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
            for(int[] b : a){
                for(int c : b ){
        System.out.println(c+"");
}
    System.out.println("");
}*/







/*Scanner sca = new Scanner(System.in);
int[] array = new int[3];
for(int a = 0 ; a < array.length; a++){
    System.out.printf("Enter number for index %d ", a);
    array[a]= sca.nextInt();

}
for(int b : array){
    System.out.println(""+ b);

}

sca.close();*/


/*Scanner sca = new Scanner(System.in);
System.out.print("Enter number of array: ");
int arrvalue = sca.nextInt();
int[] array = new int[arrvalue];
for(int a = 0 ; a < array.length; a++){
    System.out.printf("Enter number for index %d ", a);
    array[a]= sca.nextInt();

}
for(int b : array){
    System.out.println(""+ b);

}

sca.close();*/




/*Scanner sca = new Scanner(System.in);
System.out.println("Enter number of array: ");
int arrvalue = sca.nextInt();
int[] array = new int[arrvalue];
int a;

        System.out.printf("Enter number for index %d ",a);
        array[a]= sca.nextInt();

        if(a > 50){
            System.out.println("Enter number lower than 51");
            // a=sca.nextInt();
        }else{
    for( a = 0 ; a < array.length; a++){};
    }
    for(int b : array){
        System.out.println(""+ b); 
    }

}*/



       /* Scanner sca = new Scanner(System.in);

        System.out.print("Enter number of array: ");
        int arrvalue = sca.nextInt();
        int[] array = new int[arrvalue];
        int sum = 0;

        for (int a = 0; a < arrvalue; a++) {
            while (true) {
                System.out.printf("Enter number for index %d: ", a);
                int input = sca.nextInt();

                if (input < 0 || input > 50 ) {
                    System.out.println("Unacceptable! Please enter a number between 0 and 50.");
                } else {
                    array[a] = input;
                    sum +=input;
                    break; 
                }
            }
        }

        System.out.println("\nArray values are:");
        for (int num : array) {
            System.out.println(num);
        }

        System.out.println("\nTotal sum of all numbers = " + sum);

        sca.close();

    }*/

       /*  Scanner sca = new Scanner(System.in);

        System.out.print("Enter number of array: ");
        int arrvalue = sca.nextInt();
        int[] array = new int[arrvalue];

        for(int i = 0; i < array.length;i++){
            System.out.printf("Enter number for index : %d",i);
            array[i] = sca.nextInt();
        }

        System.out.println("Even Value in array");

        for(int a = 0; a < array.length;a++){
            if(array[a] % 2 == 0){
                System.out.println(array[a]);
            }
        }
         System.out.println("Odd Value in array");

        for(int a = 0; a < array.length;a++){
            if(array[a] % 2 != 0){
                System.out.println(array[a]);
            }
        }

        sca.close();
*/

     /*    Scanner sca = new Scanner(System.in);

        System.out.print("Enter number of array: ");
        int arrvalue = sca.nextInt();
        int[] array = new int[arrvalue];
        int sum = 0;

        for (int a = 0; a < arrvalue; a++) {
            while (true) {
                System.out.printf("Enter number for index %d: ", a);
                int input = sca.nextInt();

                if (input != 0 ) {
                         array[a] = input;
                
                    break; 
                    
                } else {
                    System.out.println("Unacceptable! Please don't enter number 0");
               
                }
                
            }
            
        }
        

        int positive=0;
        int negative=0;
        for(int p : array){
            if(p>0){
                positive += p;
            }else if(p<0){
                negative+=p;
            }

        }
        System.out.println(" Total Positive Number is = "+positive);
         System.out.println(" Total Negative Number is = "+negative);
    }

*/


   /*  Scanner sca = new Scanner(System.in);

        System.out.print("Enter number of array: ");
        int arrvalue = sca.nextInt();
        int[] array = new int[arrvalue];

        for(int i = 0; i < array.length;i++){
            System.out.println("Enter number for index : "+i);
            array[i] = sca.nextInt();
        }

        System.out.println("Even Value in array");

        for(int a = 0; a < array.length;a++){
            if(a % 2 == 0){
                System.out.println(array[a]);
            }
        }
         System.out.println("Odd Value in array");

        for(int a = 0; a < array.length;a++){
            if(a % 2 != 0){
                System.out.println(array[a]);
            }
        }

        sca.close();*/
    }

    
