import java.util.Scanner;

public class Exercise12{

    public static void main(String[] args){

        // User ဆီကနေပြီးတော. Array ထဲမှာ တန်ဖိုးဘယ်နှစ်ခုထည်မလဲဆိုတာတောင်း။
        // Array ထဲကာ Value တွေ.ထဲကနေ even number , odd number ကို ပြန်ခွဲပေးရမယ်။

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int size = sca.nextInt();// 4

        int[] array = new int[size];

        System.out.print("Enter your Element = ");
        for(int a = 0; a < size; a++){ // 1 , 2 , 6 , 10
            array[a] = sca.nextInt();
            // array[0] = 1
            // array[1] = 2
            // array[2] = 6
            // array[3] = 10
        }

        System.out.print("Enter your Odd Number = ");
        for(int num: array){
            if(num %2 != 0){
                System.out.print(num + " ");
            }
        }

        System.out.println("");

        System.out.print("Enter your Even Number = ");
        for(int num: array){
            if(num %2 == 0){
                System.out.print(num + " ");
            }
        }

        sca.close();

    }

}

