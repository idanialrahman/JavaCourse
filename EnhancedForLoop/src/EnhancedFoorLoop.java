import javax.naming.Name;
class MainStudent{
    String FatherName;

    int FatherAge;

}
public class EnhancedFoorLoop {
    String StudentName;
    int StudentAge;

    public static void main(String[] args) {
        EnhancedFoorLoop yes1= new EnhancedFoorLoop();
        yes1.StudentName="Ayan Ali:";
        yes1.StudentAge= 90;

        EnhancedFoorLoop Yes22 = new EnhancedFoorLoop();
        Yes22.StudentAge= 32;
        Yes22.StudentName="Wasifullah:";

        MainStudent Yes2= new MainStudent();
        Yes2.FatherAge= 78;
        Yes2.FatherName="Noor Zaman:";

        EnhancedFoorLoop Array[]= new EnhancedFoorLoop[2];
        Array[0]= yes1;
        Array[1]= Yes22;

        for (EnhancedFoorLoop Enhance: Array){
        System.out.println(Enhance.StudentAge + " :" + Enhance.StudentName);


        }

        System.out.println();




        MainStudent Array2[]= new MainStudent[1];
        Array2[0]= Yes2;
        for (MainStudent Guardian: Array2 ){
            System.out.println(Guardian.FatherAge+ " : "+ Guardian.FatherName+" : ");

        }
        System.out.println();



    }
}


