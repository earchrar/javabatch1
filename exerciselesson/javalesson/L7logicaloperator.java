public class L7logicaloperator{

    public static void main(String[] args){

        // Logical Operator 
        // & (AND) , | (OR) , ! (NOT) 

        // Ternary Operator
        // ? true : false

        // & (AND)
        int a = 10;
        System.out.println((a<5)&(a>7)); // false

        // | (OR) 
        int b = 11;
        System.out.println((b<10)|(b>9)); // true

        // | (OR) 
        int c = 12;
        System.out.println(!(c>15)); // true

        // Ternary Operator 
        // Exercise 1
            int num1 = 10;
            boolean result = (num1 == 10) ? true : false;
            System.out.println(result); // true

        // Exercise 2 
            int num2 = 50;
            int num3 = 50;
            boolean numresult = (num2 == num3) ? true : false;
            System.out.println(numresult);// true
        
        // Exercise 3 Positive / Negative / Equal 
            int num0 = 0;
            String number = (num0 > 0) ? "Positive" : (num0 < 0) ? "Negative" : "Equal";
            System.out.println(number); // Equal

    }

}