
public class EnhancedLoopInArray {
    String Name;
    String Dataname;
    String Teamlead;

    String Manager;

    public static void main(String[] args) {
        EnhancedLoopInArray names1 = new EnhancedLoopInArray();
        names1.Name="Danial:";
        names1.Manager="Maaz Khan";
        names1.Dataname="Tiger";
        names1.Teamlead="Usman";

        EnhancedLoopInArray names2 = new EnhancedLoopInArray();
        names2.Name="Danial:";
        names2.Manager="Maaz Khan";
        names2.Dataname="Tiger";
        names2.Teamlead="Usman";

        EnhancedLoopInArray names3 = new EnhancedLoopInArray();
        names3.Name="Danial:";
        names3.Manager="Maaz Khan";
        names3.Dataname="Tiger";
        names3.Teamlead="Usman";


        EnhancedLoopInArray array1[]= new EnhancedLoopInArray[3];
        array1[0]=names1;
        array1[1]=names2;
        array1[2]=names3;

        for (EnhancedLoopInArray Output: array1){
            System.out.println(Output.Dataname+" : " + Output.Teamlead+ " : " +
                   Output.Manager+ " : " + Output.Name );
        }

        System.out.println();

    }
}