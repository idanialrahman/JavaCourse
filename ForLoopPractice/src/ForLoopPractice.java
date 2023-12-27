import com.sun.source.tree.BreakTree;

/*import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the Parameter:");
        int parameter = Input.nextInt();
        System.out.println("Enter the Parameter2:");
        int parameter2= Input.nextInt();
        System.out.println("Enter the Parameter3:");
        int parameter3= Input.nextInt();

        System.out.println("The Output is :" + usingThisMethodfor(parameter,parameter2,parameter3));


        }
        public static int usingThisMethodfor(int parameter, int parameter2, int parameter3){
         int subtotal = parameter+parameter2+parameter3;
         switch (subtotal){
             case 20:
                 for (int i =2; i<=20; i++){
                     System.out.println(i);
                 return subtotal;

                     }
             case 40:
                 return parameter+parameter2+parameter;

             case 90:
                 return parameter;
             default:
                 return  subtotal;
                 }
         }



        }
*/

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Parameter:");
        int parameter = input.nextInt();
        System.out.println("Enter the Parameter2:");
        int parameter2 = input.nextInt();
        System.out.println("Enter the Parameter3:");
        int parameter3 = input.nextInt();

        System.out.println("The Output is : " + usingThisMethodfor(parameter, parameter2, parameter3));
    }

    public static int usingThisMethodfor(int parameter, int parameter2, int parameter3) {
        int subtotal = parameter + parameter2 + parameter3;
        switch (subtotal) {
            case 20:
                for (int i = 2; i <= 20; i++) {
                    System.out.println(i*2);
                }
                break; // Break out of the loop after printing
            case 40:
                return parameter + parameter2 + parameter;
            case 90:
                return parameter;
            default:
                return subtotal;
        }
        return subtotal; // Move the return statement outside the loop
    }
}
