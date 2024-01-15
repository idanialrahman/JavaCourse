//outside the package we are calling protected
class A extends ProtectedOne{
    public void caculate(){
        System.out.println(marks);
        System.out.println(num1);
        System.out.println(num2);
    }
}




//Main Method is here:
public class Main {
    public static void main(String[] args) {
        ProtectedOne objPr = new ProtectedOne();
        objPr.num1=80;
        objPr.num2=90;
        objPr.calculateMarks();
        System.out.println(objPr.marks);
        A objA = new A();
        objA.caculate();

    }
}