public class OOPfour{

    public void firstMethod(){
        System.out.println("Java Programming");
    }

    public void secondMethod(int four){
        System.out.println("Parameter value is = "+four);
    }

    public static void main(String[] args){

        OOPfour four = new OOPfour();
        four.firstMethod();
        four.secondMethod(100);

    }
}

