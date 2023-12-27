import java.util.Scanner;

public class UsingPrimeNumber {
    public static boolean findingThePrimeNumber(int num){
        if (num<1){
            return false
        }
        for (int i=2; i<=math.sqrt(num) ){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int Number= Input.nextInt();

        if (findingThePrimeNumber(Number)){
            System.out.println("This is a prime Number:" + Number);
            
        }
        else {
            System.out.println("This is not a Prime Number: " + Number);
        }





        }
    }




  /*  import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Check from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a factor, not a prime number
            }
        }

        return true; // If no factor found, it's a prime number
    }
}
