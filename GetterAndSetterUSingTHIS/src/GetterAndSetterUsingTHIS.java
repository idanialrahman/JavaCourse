//Using This in Getter and Setter

public class GetterAndSetterUsingTHIS {
    private String EnterMarks;
    private String EnterGrade;

    private String CompanyName;

    public void setEnterMarks(String Marky){
        this.EnterMarks=Marky;
    }

    public String getEnterMarks(){
        return EnterMarks;
    }

    public void setEnterGrade(String Grade){
        this.EnterGrade= Grade;
    }

    public String getEnterGrade(){
        return EnterGrade;
    }

    public void setCompanyName(String cName){
        this.CompanyName= cName;
    }

    public String getCompanyName(){
        return CompanyName;
    }


    public static void main(String[] args) {
        GetterAndSetterUsingTHIS This = new GetterAndSetterUsingTHIS();
        This.setEnterMarks("SevenEighty");
        This.setEnterGrade("B+");
        This.setCompanyName("SIParadigm");

        System.out.println(This.getEnterMarks());
        System.out.println(This.getEnterGrade());
        System.out.println(This.getCompanyName());

    }
}