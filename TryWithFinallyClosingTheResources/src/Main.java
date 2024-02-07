import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Value:");
            int Num= sc.nextInt();
            int Num2= sc.nextInt();
            int Answer = Num2/Num;
            System.out.println("Bye");
            System.out.println(Answer);
            throw new ArithmeticException();

        }
        catch (ArithmeticException ex){

            System.out.println("Finally");
        }
        finally {
            System.out.println("Finally is using to close the resources:");

        }

    }
}