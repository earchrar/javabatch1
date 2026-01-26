import java.util.Scanner;

public class Exercise11{

    public static void main(String[] args){

        // User ဆီကနေပြီးတော. Array ထဲမှာ တန်ဖိုးဘယ်နှစ်ခုထည်မလဲဆိုတာတောင်း။
        // Array ထဲကာ Value တွေ.သတ်မှတ်တဲ.နေရာမှာ 50 ထိပဲ. လက်ခံမယ် ကျော်သွားရင် Error ပြမယ်။
        // နောက်ဆုံး Output ထုတ်ချင်တာကာ Array ထဲမှာ ရှိတဲ. တန်ဖိုး အားလုံးခြင်းရဲ. Output ရလဒ်ကို ထုတ်မယ်။

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int size = sca.nextInt(); // 4 

        int[] arrayValue = new int[size];
        int sum = 0;

        for(int a = 0; a < size; a++){

            while(true){
                System.out.printf("Enter value for index %d = ",a);
                int value = sca.nextInt();

                if(value >= 0 && value <= 50){ // 20 , 30 , 40 , 20
                    arrayValue[a] = value;
                    sum += value;
                    // sum = sum + value
                    // sum = 0 looping = 0 + 20 
                    // sum = 1st looping = 20 + 30 
                    // sum = 2nd looping = 50 + 40
                    // sum = 3th looping = 90 + 20
                    break;
                }else{
                    System.out.println("Tray again");
                }
            }

        }

        System.out.println("The sum of array = "+sum);
        sca.close();

    }

}