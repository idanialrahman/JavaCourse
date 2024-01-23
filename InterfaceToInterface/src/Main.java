interface  CopyingInterface{
    void returns();
}
class InterFaceCopy implements CopyingInterface, Caculate{
     public void returns(){
        System.out.println("Maths:");
    }

    public int Calculate( int a, int b ){
         return a+b;
    }
}

interface Caculate{
    int  Calculate(int a , int b);
}
public class Main {
    public static void main(String[] args) {
        CopyingInterface copy = new InterFaceCopy();
        copy.returns();
       Caculate caculate = new InterFaceCopy();

        System.out.println(caculate.Calculate(90,90));
    }
}