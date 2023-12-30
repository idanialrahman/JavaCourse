
public class StaticBlockExample {
    long MobileNumber;
    String Name;

    static String SameValues;

    public void NamePrint(){
        System.out.println(MobileNumber+ " "+ Name+ " "+SameValues );
    }

    static {
        System.out.println("This is static Block of code");
    }

    public static void main(String[] args) {

        StaticBlockExample example= new StaticBlockExample();
        example.MobileNumber=031343443;
        example.Name="Danial";
        StaticBlockExample.SameValues="OKAY";

        example.NamePrint();



        }
    }
