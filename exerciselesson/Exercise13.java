import java.util.Scanner;

public class Exercise13{

    public static void main(String[] args){

        // ပထမအကြိမ် User ဆီကနေပြီးတော. Array ထဲမှာ 
        // တန်ဖိုး ဘယ်နှစ်ခု ထည်မလဲ. ဆိုတာတောင်း။
        // အဲဒီ array အတွက် တန်ဖိုးတွေ. သတ်မှတ်မယ် 
        // ဒုတိယအကြိမ် User ဆီကနေပြီးတော. Array ထဲမှာ 
        // တန်ဖိုး ဘယ်နှစ်ခု ထည်မလဲ. ဆိုတာတောင်း။
        // အဲဒီ အတွက် တန်ဖိုးတွေ. သတ်မှတ်မယ် 
        // output အနေနဲ. array (၂) ခုကို ပေါင်းပြီး output ထုတ်ပေးရမှာဖြစ်တယ်

        Scanner sca = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int size = sca.nextInt();

        int[] array1 = new int[size];
        System.out.println("Enter Element for the first array = ");
        for(int a = 0;a < size;a++){
            array1[a] = sca.nextInt();
        }

        int[] array2 = new int[size];
        System.out.println("Enter Element for the second array = ");
        for(int a = 0;a < size;a++){
            array2[a] = sca.nextInt();
        }

        int[] resultArray = new int[size];
        for(int a = 0;a < size;a++){
            resultArray[a] = array1[a]+array2[a];
        }

        for(int result:resultArray){
            System.out.print(result + " ");
        }

        sca.close();

    }

}

