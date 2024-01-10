class GrandFather{
    String GrandFNAME;
    String GrandFAGE;
    int GrandFChilderen;
    private String GrandFWife;

    public GrandFather(String GFN, String GFA, int GFC, String GFW){
        this.GrandFNAME=GFN;
        this.GrandFAGE=GFA;
        this.GrandFChilderen=GFC;
        this.GrandFWife=GFW;

    }
    public String getGrandFWife(){
        return GrandFWife;
    }
}

class Children extends GrandFather{

    String sonName;
    private String sonWife;

    int sonAge;
    public Children(String GFN, String GFA, int GFC, String GFW, String sName, String sonW, int sAge){
        super(GFN, GFA, GFC,GFW);
        this.sonName=sName;
        this.sonWife=sonW;
        this.sonAge=sAge;
    }
    public String getSonWife(){
        return sonWife;
    }
}

public class Main {
    public static void main(String[] args) {

        GrandFather GF = new GrandFather("ALI","Seventy",6,"Niaz");
        Children CH= new Children("Ayaz", "Seventy", 9,"ROSHAN","NOOR","IRASA",88);

        System.out.println(GF.GrandFNAME+":"+GF.GrandFAGE+":"+GF.GrandFChilderen+":"+GF.getGrandFWife());



    }
}