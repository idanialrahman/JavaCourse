
public class Students {;
    int StudentContact;
    String StudentGrade;
    String StudentName;
    int StudentId;
    public static void main(String[] args) {

        Students Student1= new Students();
        Student1.StudentName="Danial Rahman";
        Student1.StudentContact= 0314555;
        Student1.StudentGrade="A";
        Student1.StudentId=15433;

        Students Student2= new Students();
        Student2.StudentName="Ali Rahman";
        Student2.StudentContact= 23456;
        Student2.StudentGrade="A";
        Student2.StudentId=94374;

        Students Student3= new Students();
        Student3.StudentName="Alian Rahman";
        Student3.StudentContact= 9084432;
        Student3.StudentGrade="A";
        Student3.StudentId=23243;

        Students Students[]= new Students[3];
        Students[0]=Student1;
        Students[1]=Student2;
        Students[2]=Student3;

        for (int i=0 ;i< Students.length; i++){
            System.out.println(Students[i].StudentName + " " + Students[i].StudentId+
                    " "+ Students[i].StudentGrade+" "+ Students[i].StudentContact);
        }

        System.out.println();


    }
}