public class StaticExampleandObject{


    public static void main(String[] args) {

        StaticExampleandObject Sc= new StaticExampleandObject();
        Sum plus=new Sum();
        plus.a=2;
        plus.b=3;


        System.out.println();

        Calculator UsingSn= new Calculator();
        UsingSn.Subject="Programming";
        UsingSn.Area="University";
        UsingSn.Name="Danial";



    }
}
class Calculator{
    String Name;
    String Subject;
    String Area;


}
class Sum{
    int a;
    int b;
    public void sum(){
        int perform= a+b;
    }

}

