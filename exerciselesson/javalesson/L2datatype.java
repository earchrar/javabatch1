public class L2datatype{

    public static void main(String[] args){

        // Data Type => String / int / float / char / boolean 

        // => String 
        String firstname = "Aung Aung";
        System.out.println("My name is "+firstname); // My name is Aung Aung

        // => int 
        int age = 20;
        System.out.println("My age is "+20); // My age is 20

        // float = key word (f)
        float digit = 12.5f;
        System.out.println("My digit number is "+digit); // My digit number is 12.5

        // char = Character (a to z) Single quotes => Not Double quotes 
        char words = 'a';
        System.out.println("My Character is = "+words); //My Character is = a

        // boolean = true / false 
        // boolean z = true;
        boolean z = false;
        System.out.println("My z is = "+z); // My z is = true

        // long keyword = L 
        long numeric = 9223372036854775807L;
        System.out.println("My Numeric is "+numeric);// My Numeric is 9223372036854775807

        // -------------------------------------------------------------------------------------

        // Output System =  printf(,) 
        // String = %s || int = %d || float = %f || char = %c 

        String lastname = "mu yar";
        System.out.printf("My lastname is %s\n",lastname);// My lastname is mu yar

        int verifyage = 18;
        System.out.printf("My Verifyage 18 to 70 = %d\n",verifyage);// My Verifyage 18 to 70 = 18

        // float = digit = .3f || .2f 
        float number = 0.145f;
        System.out.printf("My number is %.2f\n",number);// My number is 0.14

        char character = 'A';
        System.out.printf("My Character name is = %c",character);// My Character name is = A

        // -------------------------------------------------------------------------------------

        // int vs long ( 1 bytes = 8 bits )

        // int = 4 bytes => ( 4 bytes * 8 bits ) => 32 bits
        // long = 8 bytes => ( 8 bytes * 8 bits ) => 64 bits

        // int 
        // positive value => 2,147,483,647
        // negative value => -2,147,483,648

        // int 2 = 
        // int 147 = 
        // int 483 = 
        // int 648 = 

        // long 
        // positive value => 9,223,372,036,854,775,807
        // negative value => -9,223,372,036,854,775,808

        // long 9 = Quintillion
        // long 223 = Quadrilion
        // long 372 = Trillion
        // long 036 = Billion 
        // long 854 = Million
        // long 775 = Thousand
        // long 808 = Hundred

        // Variable Name Note 
        // 1. start no number 
        // 2. no space 
        // 3. java reserved keyword => int , class , public , static , void 

        // -------------------------------------------------------------------------------------

    }

}