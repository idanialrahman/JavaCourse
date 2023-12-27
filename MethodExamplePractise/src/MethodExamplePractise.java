import java.util.Scanner;


public class MethodExamplePractise {
    public static void methodExample() {
        int marks;
        Scanner myscan = new Scanner(System.in);
        marks = myscan.nextInt();

        switch (marks) {
            case 90:
                System.out.println("Your Grade is A+");
                break;
            case 80:
                System.out.println("Grade B ");
                break;
            case 70:
                System.out.println("Grade C");
                break;

        }
        if(marks<=60){
            System.out.println("You are fail :"+ "But we are promoting you by adding ");
            int PassingMarks= marks + 30;
            System.out.println("We Added the Marks : "+ PassingMarks);

            //  int marksValue= marks;
            // System.out.println("Here are the Grade"+ marksValue);







        }
    }

    public static void main(String[] args) {
        methodExample();

    }
}


