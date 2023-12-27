class Calculator {
    int num;
    public int AddNumbers(int n1,int n2) {
        int sum= n1+n2;
        return sum;
    }

}
public class Main {
    public static void main(String[] args) {
        int Num1=24, Num2=45;

        Calculator Addition = new Calculator();

       int result= Addition.AddNumbers(Num1,Num2);

        System.out.println("Here Is the Result: " + result);



        }
    }
