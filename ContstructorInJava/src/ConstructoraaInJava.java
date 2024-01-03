import java.security.PublicKey;

public class ConstructoraaInJava {

    private int Age;
    private int DOB;

    String Name;

    private String CityName;

    public ConstructoraaInJava(){
        Age=150;
        Name="Danial";
        DOB=9093;
        CityName="Peshawar";
    }

    public int getDOB(){
        return DOB;
    }
    public String getCityName(){
        return CityName;
    }

    public int getAge(){
        return Age;
    }

    public static void main(String[] args) {

        ConstructoraaInJava CONS = new ConstructoraaInJava();
        System.out.println(CONS.getAge()+ ":"+CONS.getCityName()+":"+ CONS.getDOB()+":" +CONS.Name);

    }
}