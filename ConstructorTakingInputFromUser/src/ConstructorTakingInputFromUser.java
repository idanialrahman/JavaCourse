import java.util.Scanner;

public class ConstructorTakingInputFromUser {

    String username;
    String password;

    String HintPassword;

    private int mNumber;

    public ConstructorTakingInputFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username");
        username= sc.next();
        System.out.println("Enter the Password:");
        password= sc.next();
        System.out.println("Enter the HintPassword:");
        HintPassword= sc.next();
        System.out.println("Enter the mNumber:");
        mNumber= sc.nextInt();

        System.out.println();
    }

    public int getmNumber(){
        return mNumber;
    }



    public static void main(String[] args) {

        ConstructorTakingInputFromUser user = new ConstructorTakingInputFromUser();
        System.out.println(user.getmNumber()+":"+user.HintPassword+":"+user.username+":"+ user.password);

    }
}