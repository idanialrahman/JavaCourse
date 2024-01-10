class Caculator{
    int Sum;
    public int sumOfthe(int a, int b ){
        return a+b;
    }

    int Sub;
    public int subOfthe ( int a, int b){
        return a-b;
    }

}
public class InHeritance {
    public static void main(String[] args) {

        Caculator AddingSub= new Caculator();
        AddingSub.sumOfthe(25, 32);
        AddingSub.subOfthe(90,78);
        AdVance AD = new AdVance();
        AD.multiPly(90,32);
        AD.divThe(32,4);
        AD.subOfthe(90, 80);

    }
}