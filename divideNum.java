import java.util.Scanner;

public class divideNum {
    
    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);
        int arrValue1 = 0;
        int arrValue2 = 0;
        int arrValue3 = 0;

        System.out.print("Enter number of array: ");
        int arrvalue = sca.nextInt();
        int[] array = new int[arrvalue];

        for(int x = 0; x < array.length;x++){
            System.out.print("Enter number of index : "+x);
            array[x] = sca.nextInt();
        }

        System.out.println("Positive number");

        for(int i = 0; i < array.length;i++){
            if(array[i] > 0){
                System.out.println(array[i]);
                arrValue1++;
            };
        }
        System.out.println("The number of array + = "+arrValue1);

        System.out.println("Negative Number");

        for(int i = 0; i < array.length;i++){
            if(array[i] < 0){
                System.out.println(array[i]);
                arrValue2++;
            };
        }
        System.out.println("The number of array - = "+arrValue2);

        System.out.println("Equal 0");

        for(int i = 0; i < array.length;i++){
            if(array[i] == 0){
                System.out.println(array[i]);
                arrValue3++;
              };
        }
        System.out.println("The number of array 0 = "+arrValue3);


        sca.close();
    }

}
