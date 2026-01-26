public class OOPeight{

    int modalYear;
    String modalName;

    public OOPeight(int a){
        modalYear = a;
    }

    public OOPeight(String b){
        modalName = b;
    }

    public static void main(String[] args){
        OOPeight obj1 = new OOPeight(10);
        OOPeight obj2 = new OOPeight("Java");

        System.out.println(obj1.modalYear);
        System.out.println(obj2.modalName);
    }

}