class ToString{
    String Name;
    String FatherName;

    int MathsMarks;

    public String toString() {
        return Name+ FatherName+ MathsMarks;

    }

    public boolean equal(ToString that){
        if (this.Name.equals(that.Name) && this.FatherName.equals(that.FatherName))
            return true;
        else
            return false;
    }
}
public class Main {
    public static void main(String[] args) {
        ToString obj = new ToString();
        obj.FatherName="NOOR ZAMAN";
        obj.Name="Danial Rahman";
        obj.MathsMarks=80;

        System.out.println(obj);

        ToString obj2 = new ToString();
        obj2.FatherName="NOOR ZAMAN";
        obj2.Name="Danial Rahman";
        obj2.MathsMarks=80;

        boolean result = obj.equal(obj2);
        System.out.println(result);




    }
}