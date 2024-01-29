import java.util.Scanner;

interface LambdaString{
    String show(String Name);
}
interface LambdaStringForWithoutReturn{
    boolean show(String result);
}

public class Main {
    public static void main(String[] args) {
        LambdaStringForWithoutReturn lambdaStringForWithoutReturn = (String result) -> {
            System.out.println("Without Return:");

            return false;
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String result = sc.next();
        System.out.println(lambdaStringForWithoutReturn.show(result));
        LambdaString lambdaString = new LambdaString() {
            @Override
            public String show(String Name) {

                return Name;
            }
        };



    }

}
