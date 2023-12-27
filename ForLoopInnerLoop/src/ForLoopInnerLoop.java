import javax.swing.*;
import java.util.Scanner;

public class ForLoopInnerLoop {

    public static int ForLoopIn(int Number1, int Number2){
        for (int i=1; i<=Number1; i++){
            for( int j=1; j<=Number2;j++){
                int result= i*j;
                System.out.println("The Value of I and J is:"+ result);
            }
            System.out.println("Output"+i);
        }
        return Number1*Number2;

    }




    public static void main(String[] args) {

        System.out.println("Enter the Table Number");
        Scanner MyNum = new Scanner(System.in);
        int Number1= MyNum.nextInt();
        System.out.println("Another Number you want to Calculate with it:");
        int Number2 = MyNum.nextInt();

        System.out.println(ForLoopIn(Number1,Number2));

    }
}