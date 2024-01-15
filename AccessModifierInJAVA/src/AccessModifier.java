import PublicModifier.*;

public class AccessModifier {
    public static void main(String[] args) {
        PUBLIC objP = new PUBLIC();
        System.out.println("Printing The Public Modifier:");

       int a = objP.a;

        System.out.println(a+":  "+ objP.add(22,32));
        FindingA objF= new FindingA();
        int Objefn= objF.a;
        System.out.println(Objefn+ ":"+ objF.add(32,90) );

    }
}