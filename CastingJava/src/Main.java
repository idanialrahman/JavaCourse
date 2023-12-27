import java.util.Scanner;

public class Main {
    public static boolean decimalComparator(double first, double second) {
        long firstRound = (long) (first * 1000);
        long secondRound = (long) (second * 1000);
        return firstRound == secondRound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first decimal number:");
        double firstNumber = sc.nextDouble();

        System.out.println("Enter the second decimal number:");
        double secondNumber = sc.nextDouble();

        boolean result = decimalComparator(firstNumber, secondNumber);

        System.out.println("Are the numbers equal when rounded to three decimal places? " + result);
    }
}
