import java.util.Scanner;

public class L12array{

    public static void main(String[] args){

        // java array 
        // array => Index number => Start zero
        // Method 1
            // String[] name = new String[4];
            // name[0] = "Java";
            // name[1] = "Python";
            // name[2] = "Goland";
            // name[3] = "C++";
            // System.out.print(name[0]);

        // Method 2 
            // String[] name = {"Java","Python","Goland","C++"};
            // System.out.print(name[4]);

        // Exercise 1 
            // String[] name = {"Java","Python","Goland","C++"};
            // for(int a = 0; a < name.length;a++){
            //     System.out.println(name[a]);
            // }

        // java array for else 
            // Method 1
            // String[] name = {"Java","Python","Goland","C++"};
            // for(String a:name){
            //     System.out.println(a);
            // }

            // Exercise 1 
                // Example 
                // index 0 
                // index 1
                    Scanner sca = new Scanner(System.in);
                    int[] array = new int[3];
                    for(int a = 0; a < array.length;a++){
                        System.out.printf("Enter number for index %d = ",a);
                        array[a] = sca.nextInt();
                    }

                    for(int arr:array){
                        System.out.println(arr);
                    }

                    sca.close();
    }

}