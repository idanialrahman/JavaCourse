// we can call the method in main method using extend but not change the same parameter in the subclass



class Addition{
    final int a= 10;
    int b= 30;

    int c = a+b;

    public final void show(int n1, int n2){
        System.out.println(n1+n2);
    }
    public final void printF(){
        System.out.println("Hello Name: ");
    }

}

class CheckFinal extends Addition{

    public void printFF(){
        System.out.println("Danial");
    }
    public void show(){
        System.out.println("Ok");
    }



}

public class Main {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.show(90,90);
        add.printF();



        CheckFinal objF = new CheckFinal();
        objF.printFF();
        objF.show();








    }
}