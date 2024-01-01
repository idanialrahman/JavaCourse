// In this program we Just Get the Data from the private Variable using the Public Function
public class Encapsulation {

    private int age=90;
    private String Name= "Danial";
    private String UniversityName= "INU";

    public int  getAge(){
        return age;
    }
    public String getName(){
        return Name;
    }
    public String getUniversityName(){
        return UniversityName;
    }
    public static void main(String[] args) {
        Encapsulation myvalues= new Encapsulation();
        System.out.println("Your Output of the Private Values :");
        System.out.println(myvalues.getUniversityName()+ ": "+ myvalues.getName()+": "+ myvalues.getAge());

    }
}