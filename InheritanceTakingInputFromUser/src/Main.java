import java.util.Scanner;

class GradingSystem{
    String StudentName;
    int StudentMarks;
    public String marksS(int Marks){
        if (Marks>=90){
            return "You are Pass";
        }
        else {
            return "you are Fail";

        }
    }
}

class StudentDetail extends GradingSystem{
    String StudentAddress;
    int StudentContact;

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Data:");
        GradingSystem Grade = new GradingSystem();
        System.out.println("Enter the Name:");
        Grade.StudentName= sc.next();
        System.out.println("Enter the Marks");
        Grade.StudentMarks= sc.nextInt();
        System.out.println(Grade.marksS(Grade.StudentMarks)+ " "+ Grade.StudentName+ ":");
        StudentDetail Detail = new StudentDetail();
        System.out.println("Enter the Name");
        Detail.StudentName=sc.next();
        System.out.println("Enter the Address");
        Detail.StudentAddress= sc.next();
        System.out.println("Enter the contact ");
        Detail.StudentContact=sc.nextInt();
        System.out.println("Enter the Marks ");
        Detail.StudentMarks=sc.nextInt();



        System.out.println(Detail.StudentAddress+" "+ Grade.StudentName +" :"+ Detail.marksS(Detail.StudentMarks));

    }
}