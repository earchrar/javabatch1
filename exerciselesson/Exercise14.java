import java.util.Scanner;

public class Exercise14{

    public static void main(String[] args){

        // User ဆီကနေ array ထဲမှာ size ဘယ်လောက်သတ်မှတ်မှာလဲဆိုတာ တောင်မယ်။
        // arry ထဲမှာ value တွေ.ရိုက်ထည်မယ်။
        // array ထဲမှာ zero ဘယ်နှစလုံး positive number ဘယ်နှစ်လုံး negative number ဘယ်နှစ်လုံးဆိုတာ ရေတွက်ပေးရမှာ။

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int size = sca.nextInt();// 5

        int[] array = new int[size];
        for(int a = 0; a < size;a++){
            array[a] = sca.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int result: array){

            if(result > 0){
                positiveCount++;
            }else if(result < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }

        }

        System.out.println("Positive Elements : "+positiveCount);
        System.out.println("Negative Elements : "+negativeCount);
        System.out.println("Zero Elements : "+zeroCount);

    }

}

