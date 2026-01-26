import java.util.Scanner;

public class Exercise6 {

        // Name / Age / ID 
        // Examintaion = Myanmar / English / Mathematics / Physics / Chemistry / Biology
        // Distraction
        // Myanmar (75 marks ကျော်ရင် distraction ထွက်မယ်) 
        // English (75 marks ကျော်ရင် distraction ထွက်မယ်)
        // Mathematics (80 marks ကျော်ရင် distraction ထွက်မယ်)
        // Physics (80 marks ကျော်ရင် distraction ထွက်မယ်)
        // Chemistry (80 marks ကျော်ရင် distraction ထွက်မယ်)
        // Biology  (80 marks ကျော်ရင် distraction ထွက်မယ်)
        // Passed ( 40 marks ထပ်ညီပြီးကျော်ရင် အောင်တယ် )
        // Failed ( 40 marks ထပ်အောက်ရောက်ရင် ကျမယ် ) 
        // Grade = 75 (A) / 70 (B) / 40(C) / (D) 

        public static void main(String[] argus){

            Scanner sca = new Scanner(System.in);
            System.out.print("Enter Student Name = ");
            String students = sca.nextLine();
            System.out.print("Enter Student Age = ");
            int age = sca.nextInt();
            System.out.print("Enter Student ID = ");
            int id = sca.nextInt();
            System.out.print("Enter Marks for Myanmar = ");
            int myanmar = sca.nextInt();
            System.out.print("Enter Marks for English = ");
            int english = sca.nextInt();
            System.out.print("Enter Marks for Mathematics = ");
            int mathematics = sca.nextInt();
            System.out.print("Enter Marks for Physics = ");
            int physics = sca.nextInt();
            System.out.print("Enter Marks for Chemistry = ");
            int chemistry = sca.nextInt();
            System.out.print("Enter Marks for Biology = ");
            int biology = sca.nextInt();

            System.out.println("No.1 Student = "+students);
            System.out.println("No.2 Age = "+age);
            System.out.println("No.3 ID = "+id);

            int totalmarks = myanmar+english+mathematics+physics+chemistry+biology;
            System.out.println("Total Grade 12 2025 Marks is = "+totalmarks);

            float average = (float) totalmarks / 3;
            System.out.printf("Average mark of one Subject is = %.0f",average);
            System.out.println("");

            if(myanmar >= 40 && english >= 40 && mathematics >= 40 && physics >= 40 && chemistry >= 40 && biology >= 40){
                System.out.println("You Examination is Passed.");

                if(myanmar >= 75 || english >= 75 || mathematics >= 80 || physics >= 80 || chemistry >= 80 || biology >= 80){

                    System.out.print("Your Distraction Subject is = ");

                        if(myanmar >= 75){
                            System.out.print("Myanmar ");
                        }

                        if(english >= 75){
                            System.out.print("English");
                        }

                        if(mathematics >= 80){
                            System.out.print(" Mathematics");
                        }

                        if(physics >= 80){
                            System.out.print(" Physics");
                        }

                        if(chemistry >= 80){
                            System.out.print(" Chemistry");
                        }

                        if(biology >= 80){
                            System.out.print(" Biology");
                        }

                        System.out.println("");
                        System.out.print("Your Grade is = ");

                        if(average >= 75){System.out.print("A");}
                        else if(average > 74){System.out.print("B");}
                        else if(average > 40){System.out.print("C");}
                        else{System.out.print("D");}

                }


            }else{
                System.out.println("You Examination is failed.");
            }

        }
    
}
