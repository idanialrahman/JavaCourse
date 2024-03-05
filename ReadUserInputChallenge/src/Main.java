import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int Counter=1;
       int sum=0;

       while(Counter<=5){
           System.out.println("The Counter #" + Counter);
           System.out.println("Enter the Value:");
           String NextNumber = sc.nextLine();
           try {
               int Number = Integer.parseInt(NextNumber);
               sum +=Number;
               Counter++;
           }catch (NumberFormatException NFE){
               System.out.println("Enter The Valid Number :");
           }
           System.out.println("The Sum:"+ sum);
       }
    }
}