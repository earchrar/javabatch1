import java.util.Scanner;

public class Exercise15{

    public static void main(String[] args){

        // User ဆီကနေ Array ထဲမှာ Value ဘယ်နှစ်ခုထည်မှာလဲဆိုတာ မေးမယ်။ 
        // Array အတွက် Value တွေ.သတ်မှတ်မယ်။
        // Array အတွက် ထပ်ထည်မယ် Value အသစ်တစ်ခုတောင်းမယ်။
        // Value အသစ်ကို Array ရဲ. Index no ဘယ်လောက်မှာ ထည်မှာလဲဆိုတာ တောင်းမယ်။ 
        // Array ထဲမှာ ရှိတဲ. နောက်ဆုံး Value အစီအစဉ်အတိုင်းကို Output ထုတ်မယ်။ 

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int size = sca.nextInt(); // 4

        int[] array = new int[size+1];
        for(int a = 0; a < size; a++){
            array[a] = sca.nextInt();
        }

        System.out.print("Enter the index where you want to insert = ");
        int index = sca.nextInt(); // 1
        System.out.print("Enter the value to insert = ");
        int value = sca.nextInt();// 100

        for(int a = size; a > index; a--){
            array[a] = array[a-1];
            // array[4]  array[4-1]
            // array[3]  array[3-1]
            // array[2]  array[2-1]
            // array = {10, ,20,7,25}
        }
        array[index] = value; // array[1] = 100 // array = {10,100,20,7,25}

        System.out.print("Update Array = ");

        for(int num:array){
            System.out.print(num + " ");
        }

        sca.close();

    }

}

