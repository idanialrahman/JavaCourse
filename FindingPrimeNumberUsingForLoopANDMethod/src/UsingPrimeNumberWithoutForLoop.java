import java.util.Scanner;

public class UsingPrimeNumberWithoutForLoop {
    public static void main(String[] args) {
        Scanner NumberIn = new Scanner(System.in);

        System.out.println("Enter the Number");
        int Number1 = NumberIn.nextInt();
        int Number2= NumberIn.nextInt();
        int Number3= NumberIn.nextInt();

        System.out.println(isPrime(Number1));
        System.out.println(isPrime(Number2));
        System.out.println(isPrime(Number3));


    }

    public static boolean isPrime(int Number) {
        if (Number <= 1) {
            return false;
        }
        for (int i = Number; i <= Number; i++) {

            if (Number % 2 == 0) {


                return false;
            }
        }
        return true;
    }
}
