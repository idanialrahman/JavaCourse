import java.util.StringTokenizer;

class ToStringDiffrent{
    String Name;
    int Marks;


    public String toString() {
       return Name+":"+Marks;
    }

    public boolean Compare(ToStringDiffrent that){

        return this.Marks == that.Marks && this.Name.equals(that.Name);

    }


}
public class Main {
    public static void main(String[] args) {

        ToStringDiffrent obj1 = new ToStringDiffrent();
        obj1.Marks=90;
        obj1.Name="Danial";
        System.out.println(obj1);

        ToStringDiffrent obj2 = new ToStringDiffrent();
        obj2.Marks=90;
        obj2.Name="Danial";
        System.out.println(obj2);

        boolean ouptut= obj1.Compare(obj2);


        System.out.println(ouptut);

        ToStringDiffrent obj3 = new ToStringDiffrent();

        obj3.Marks=80;
        obj3.Name="Checked";
        boolean result= obj1.Compare(obj3);
        System.out.println(result);


    }
}