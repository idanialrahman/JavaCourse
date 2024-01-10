import java.awt.*;
import java.util.Scanner;

class A{
    private String Name;
    String university;

    public String getName(){
        return Name;
    }

    public void setName(String Names){
        Name= Names;
    }
}

class B extends A{
    int MobileNum;
    String Model;


}

class C extends B{
    String crickter;
    String NameofPlayer;
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value:");
        A objA= new A();
        System.out.println("UniversityName");
        objA.university= sc.next();
        System.out.println("Name:");
        objA.setName(sc.next());

        System.out.println(objA.university+ " : "+ objA.getName());
        B ObjB = new B();
        System.out.println("Mobile Number:");
        ObjB.MobileNum= sc.nextInt();
        System.out.println("Name");
        ObjB.setName(sc.next());

        System.out.println(ObjB.MobileNum+" : "+ ObjB.getName());

        C oBjc = new C();
        oBjc.crickter= sc.next();
        oBjc.NameofPlayer=sc.next();
        oBjc.setName(sc.next());

        System.out.println(oBjc.crickter+" :"+ oBjc.getName()+" :"+ oBjc.NameofPlayer);





    }
}