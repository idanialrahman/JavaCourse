import java.util.Scanner;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.next();
        System.out.println("Enter the Age:");
        int age;
        do {
            try {
                age = sc.nextInt();
                if (age < 18 || age > 50) {
                    System.out.println("Age is not in the range of 18 to 50. Please enter again.");
                } else {
                    int birthYear = currentYear - age;
                    System.out.println("Your age is: " + age);
                    System.out.println("Your birth year is: " + birthYear);
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid age (between 18 and 50).");
                sc.next(); // Consume invalid input
                age = -1; // Set age to -1 to continue the loop
            }
        } while (age < 18 || age > 50);

       // System.out.println("Enter the Current Year:");
        //int inputCurrentYear = sc.nextInt();

       // System.out.println("The age is:" + (inputCurrentYear - currentYear + age));
    }
}
