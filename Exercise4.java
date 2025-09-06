import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] arugs){

        // Examintaion = Myanmar / English / Mathematics 
        // Distraction = Myanmar / English / Mathematics => 75 marks  ကျော်ရင် distraction ထွက်မယ်
        // Passed = Myanmar / English / Mathematics =>   40 marks ထပ်ညီပြီးကျော်ရင် အောင်တယ်
        // Failed = Myanamr / English / Mathematics  => 40 marks ထပ်အောက်ရောက်ရင် ကျမယ်
        // Grade = Myanamr / English / Mathematics =>  90 >= (A) / 80 >= (B) / 70 >= (C) / 60 >= (D) / 50 >= (E)


        Scanner sca = new Scanner(System.in);
        System.out.print("Enter Mark for Myanmar = ");
        int myanmar = sca.nextInt();
        System.out.print("Enter Mark for English = ");
        int english = sca.nextInt();
        System.out.print("Enter Mark for Mathematics = ");
        int mathematics = sca.nextInt();

        int totalmarks = myanmar + english + mathematics;
        System.out.println("Total Marks is = "+totalmarks);

        float average = (float) totalmarks / 3;
        System.out.println("Average mark of one subject is = "+average);// float
        // System.out.printf("Average mark of one subject is = %.0f  ",average); // number

        if(myanmar >= 40 && english >= 40 && mathematics >= 40){
            System.out.println("Your Examination is Passed.");

            if(myanmar >= 75 || english >= 75 || mathematics >= 80){

                System.out.print("Your Distraction subject is = ");

                if(myanmar >= 75){
                    System.out.print("Myanmar ");
                }

                if(english >= 75){
                    System.out.print("English");
                }

                if(mathematics >= 75){
                    System.out.print(" Mathematics");
                }

                System.out.println("");
                System.out.print("Your Grade is = ");

                if(average >= 90){System.out.print("A");}
                else if(average >= 80){System.out.print("B");}
                else if(average >= 70){System.out.print("C");}
                else if(average >= 60){System.out.print("D");}
                else{System.out.print("E");}

            }

        }else{
            System.out.println("Your Examintation is Failed.");
        }



    }
    
}
