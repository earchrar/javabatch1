public class Exercise8{

    public static void main(String[]args){

        // System.out.print("Hello");

        // Exe 1 

            for(int a = 1; a <= 5;a++){

                for(int b = 1; b <= a;b++){
                    System.out.print("*");
                }

                System.out.println();
            }

        // Exe 2 

            for(int c = 1; c <= 4;c++){

                for(int d = 1; d <= c;d++){
                    if(d % 2 == 0){
                        System.out.print("0");
                    }

                    if(d % 2 != 0){
                        System.out.print("1");
                    }
                }

                System.out.println();

            }

            for(int e = 1; e <= 5;e++){

                for(int f = 1; f <= 5-e;f++){
                    System.out.print(" ");
                }

                for(int f = 1; f <= e;f++){
                    System.out.print("*");
                }

                System.out.println();

            }



    }

}