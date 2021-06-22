public class Rose{
    public Rose(String colour){
        System.out.println("passed colour is:"+colour);
    }
    public static void main(String[] args){
        Rose myRose=new Rose("red");
        myRose=new Rose("White");
    }
}
