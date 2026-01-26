public class L9forLoop{

    public static void main(String[] args){
        // java for Loop 

        // Exercise 1 Increment
        // for(int x = 1; x <= 5;x++){
        //     System.out.println("Number = "+x);
        // }

        // Exercise 2 Array [Increment]
        // int[] num = {1,2,3,4,5};
        // for(int y = 0; y < num.length;y++){
        //     System.out.println("Index = "+y+ " Value is = "+num[y]);
        // }

        // Exercise 1 Decrement
        // for(int z = 6; z >= 0;z--){
        //     System.out.println("Number = "+z);
        // }

        // Exercise 2 Array [Decrement]
        // int[] num = {1,2,3,4,5};
        // for(int s = (num.length)-1; s >= 0;s--){
        //     System.out.println("Index = "+s+ " Value is = "+num[s]);
        // }

        // java nested for loop 

        // Exercise 1 
        // Example 1 
            // Unit 1 
            // Unit 1.1 
            // Unit 1.2 
            // Unit 2 
            // Unit 2.1 
            // Unit 2.2 
        
        // for(int a = 1; a <= 2;a++){

        //     System.out.println("Unit "+a);

        //     for(int b = 1; b <=2;b++){

        //         System.out.println("Unit "+a+ "."+b);

        //     }
        // }

        // Exercise 2
        // Example 1 
            // 12345
            // 12345
            // 12345
        
        // for(int c = 1; c <= 3;c++){
        //     for(int d = 1; d <= 5;d++){
        //         System.out.print(d);
        //     }
        //     System.out.println("");
        // }

        // Exercise 3
        // Example 1 
            // 12345
            // 246810
            // 3691215
        
        // for(int e = 1; e <= 3;e++){
        //     for(int f = 1; f <= 5;f++){
        //         System.out.print(e*f);
        //     }
        //     System.out.println("");
        // }

        // Exercise 4
        // Example 1 
            // *
            // **
            // ***
            // ****

            for(int g = 1; g <= 4;g++){
                for(int h = 1; h <= g;h++){
                    System.out.print("* ");
                }
                System.out.println("");
            }

    }
}