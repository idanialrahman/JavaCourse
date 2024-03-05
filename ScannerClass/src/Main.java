import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the DOB");
        int DOB= sc.nextInt();
        System.out.println("Enter the Current Year:");
        int CurrentYear= sc.nextInt();

        System.out.println("The age is:" + (CurrentYear-DOB));
    }
}