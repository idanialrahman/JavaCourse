import PrivatePacakges.PrivateAccess;

public class Main {
    public static void main(String[] args) {
        PrivateAccess objp= new PrivateAccess();
        objp.setName("Name");
        objp.setNum1(90);
        objp.setNum2(90);
        objp.PrivateAccess(90,90);


        System.out.println(objp.getName()+":"+objp.getNum1()+ ":"+ objp.getNum2());
        System.out.println(objp.PrivateAccess(90,90));
    }
}