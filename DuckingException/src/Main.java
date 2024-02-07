class Calculate{
    public static int devide(int nominator , int denominator){
        return nominator/denominator;
    }

}
public class Main {
    public static void main(String[] args) {
        Calculate cal = new Calculate();

        try {
            int result;
            result=Calculate.devide(40, 0);
            System.out.println(result);

        }catch (ArithmeticException Maths){
            System.out.println("Error In Math:");
        }
    }
}
/*public class Example {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Cannot divide by zero");
        }
    }

    public static int divide(int numerator, int denominator) {
        // This method might throw an ArithmeticException
        return numerator / denominator;
    }
}*/
