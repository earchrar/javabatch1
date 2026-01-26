public class OOPsix{ // class 

    int yearC;
    String nameC;

    public OOPsix(int year, String name){ // class constructor 
       yearC = year;
       nameC = name;
    }

    public static void main(String[] args){
        OOPsix six = new OOPsix(10,"Java");
        System.out.print(six.yearC +" " +six.nameC);
    }
}