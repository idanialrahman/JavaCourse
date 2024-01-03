import java.util.Scanner;

public class TakingInputFromUserGetterandSetter {

    private String ManagerName;
    private String TeamleadName;
    private String DirectorName;

    public void setManagerName(String mName){
        this.ManagerName= mName;
    }
    public String getManagerName() {
        return ManagerName;
    }
    public void setTeamleadName(String tlead){
        this.TeamleadName=tlead;
    }
    public String getTeamleadName(){
        return TeamleadName;
    }
    public void setDirectorName(String pDirector){
        this.DirectorName=pDirector;
    }
    public String getDirectorName(){
        return DirectorName;
    }


    public static void main(String[] args) {
        TakingInputFromUserGetterandSetter Input= new TakingInputFromUserGetterandSetter();
        System.out.println("Enter the Subject of the Following :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Manager Name:");
        Input.setManagerName(sc.next());
        System.out.println("Enter the Teamlead Name: ");
        Input.setTeamleadName(sc.next());
        System.out.println("Enter the Director Name:");
        Input.setDirectorName(sc.next());

        System.out.println(Input.getManagerName()+" :"+ Input.getTeamleadName()+":"+ Input.getDirectorName());

    }
}