import java.util.Scanner;

public class L4arithmeticoperator{

    public static void main(String[] args){

        // Arithemetic Operators ( additon , subtraction , division , multiple , modulue , increment ++ , decrement -- )
        // Unary operators ( + - ++ -- )
        // final keyword

        // Addition (+) 
        int a = 10;
        int b = 20;
        int add = a+b;
        System.out.printf("Result is = %d\n",add); // 30

        // Subtraction (-) 
        int c = 10;
        int d = 20;
        int sub = c-d;
        System.out.printf("Result is = %d\n",sub);// 

        // Multiple (*) 
        int e = 10;
        int f = 20;
        int mul = e*f;
        System.out.printf("Result is = %d\n",mul);// 

        // Division (/) စားလဒ်
        int g = 10;
        int h = 20;
        int div = g/h;
        System.out.printf("Result is = %d\n",div);// 

        // Modulue (/) အကြွင်း
        int i = 10;
        int j = 20;
        int mod = i/j;
        System.out.printf("Result is = %d\n",mod);// 

        // increment (++) 
        int k = 10;
        int l = 20;
        int inc = k+j;
        // After Print 
            System.out.printf("Result is = %d\n",inc++);
            System.out.printf("Result is = %d\n",inc);
        // Before Print 
            System.out.printf("Result is = %d\n",++inc);
            System.out.printf("Result is = %d\n",inc);

        // decrement (--) 
        int n = 10;
        int m = 20;
        int dec = n-m;
        // After Print 
            System.out.printf("Result is = %d\n",dec--);
            System.out.printf("Result is = %d\n",dec);
        // Before Print 
            System.out.printf("Result is = %d\n",--dec);
            System.out.printf("Result is = %d\n",dec);

        // Exercise 1
            // Scanner sca = new Scanner(System.in);
            // System.out.print("Enter integer number = ");
            // int fstnum = sca.nextInt();
            // System.out.print("Enter integer number = ");
            // int lstnum = sca.nextInt();
            // int result = fstnum + lstnum;
            // System.out.println("Result numbers is = "+result);

            // sca.close();

        // Exercise 2 
            // Scanner sca = new Scanner(System.in);
            // System.out.print("Enter integer number = ");
            // int fstnum = sca.nextInt();
            // System.out.print("Enter integer number = ");
            // int lstnum = sca.nextInt();
            // float result = (float)fstnum + lstnum;
            // System.out.println("Result numbers is = "+result);

            // sca.close(); 

        // final keyword
        // Without final keyword 
        // String languages = "Java Programming";
        // languages = "Python Programming";
        // System.out.printf("Subject is %s",languages);

        // With final keyword 
        final String languages = "Java Programming";
        System.out.printf("Subject is %s",languages);

    }

}