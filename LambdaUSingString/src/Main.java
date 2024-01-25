import java.util.Scanner;

interface LambdaString{
    String show(String Name);
}
interface LambdaStringForWithoutResurn{
    void show();
}

public class Main {
    public static void main(String[] args) {
        LambdaString lambdaString= (String Name)->{
            System.out.println("HelloG");
            Scanner sc = new Scanner(System.in);
            Name= sc.next();
            return Name;

        };
        System.out.println( lambdaString.show());




    }

}