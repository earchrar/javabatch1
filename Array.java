// import java.text.ListFormat.Style;
import java.util.Scanner;

public class Array {

    public static void main(String[] args){

        // Array 

        // Method 1 

        // String[] name = new String[4];
        // name[0] = "Mg Mg";
        // name[1] = "Aung Aung";
        // name[2] = "Hla Hla";
        // name[3] = "Mya Mya";

        // System.out.print(name[2]);
        // System.out.print(name[3]);

        // Method 2 

        // String[] name = {"Aung Aung","Mg Mg","Mya Mya","Hla Hla"};
        // System.out.print(name[3]);

        // Exercise 1 
        // String[] name = new String[3];
        // name[0] = "Aung Aung";
        // name[1] = "Mg Mg";

        // System.out.print(name[2]);// null

        // Exercise 2 

        // String[] name = {"Aung Aung","Mg Mg","Mya Mya"};
        // for(int a = 0; a < name.length;a++){
        //     System.out.println(name[a]);
        // }

        // Exercise 3 
        // String[] name = {"Aung Aung","Mg Mg","Mya Mya"};
        // for(int a = name.length-1;a >= 0;a--){
        //     System.out.println(name[a]);
        // }

        // Exercise 4 
        // String[] name = {"Aung Aung","Mg Mg","Mya Mya"};
        // for(String a: name){
        //     System.out.println(a);
        // }

        // Exercise 5 
        // int[][][] a = {
        //     { // 0
        //         {1,2,{11,22,33}}
        //        0 {1,2,3},
        //        1 {11,22,33}
        //     },
        //     {
        //         {4,5,6}
        //     },
        //     {
        //         {7,8,9}
        //     }
        // };
        // System.out.print(a[0][1][2]);

        // Exercise 6
        
        // int[][] a = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // for(int b = 0; b < a.length;b++){

        //     for(int c = 0; c < a.length;c++){
        //         System.out.println(a[b][c]);
        //     }
        //     System.out.println();

        // }

        // Exercise 7 
        // int[][] a = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // for(int b = a.length-1; b >= 0;b--){

        //     for(int c = a.length-1;c >= 0;c++){
        //         System.out.println(a[b][c]);
        //     }
        //     System.out.println();

        // }

        // Exercise 8 

        // int[][] a = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // for(int[] b: a){
        //    for(int c:b){
        //     System.out.print(c);
        //    }
        //    System.out.println();
        // }

        // Exercise 9 

        // Scanner sca = new Scanner(System.in);
        // int[] array = new int[3];

        // for(int a = 0; a < array.length;a++){
        //     System.out.printf("Enter number for index = %d",a);
        //     array[a] = sca.nextInt();
        // }

        // for(int b:array){
        //    System.out.print(b);
        // }

        // sca.close();

        // Exercise 10 

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Enter number of array = ");
        // int arrValue = sca.nextInt();
        
        // int[] array = new int[arrValue];

        // for(int a = 0; a < array.length;a++){
        //     System.out.printf("Enter number for index %d",a);
        //     array[a] = sca.nextInt();
        // }

        // for(int b:array){
        //    System.out.println(b);
        // }

        // sca.close();

        // Exercise 11 

            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter array size: ");
            // int n = sc.nextInt();
            // int[] arr = new int[n];
            // int sum = 0;
            
            // for (int i = 0; i < n; i++) {
            //     while (true) {
            //         System.out.printf("Enter value for index %d: ", i);
            //         int num = sc.nextInt();
                    
            //         if (num < 0 || num > 50) {
            //             System.out.println("Invalid! Enter 0-50 only.");
            //         } else {
            //             arr[i] = num;
            //             sum += num;
            //             break;
            //         }
            //     }
            // }
            
            // System.out.println("\n Array values:");
            // for(int num : arr) {
            //     System.out.println(num);
            // }
            // System.out.println("Total sum: " + sum);
            
            // sca.close();

            
    }

}
