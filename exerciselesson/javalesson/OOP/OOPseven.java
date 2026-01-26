public class OOPseven{ // class 

    int a;

    // this keyword
    public OOPseven(int a){ // class constructor 
       this.a = a;
    }

    public static void main(String[] args){
        OOPseven seven = new OOPseven(10);
        System.out.print(seven.a);
    }
    
}