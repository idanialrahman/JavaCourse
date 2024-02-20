import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> StringName = new ArrayList<>();
        StringName.add("Danial:");
        StringName.add("Obaid:");
        StringName.add("Riyaz:");
        StringName.add("Bango:");


        try {
            System.out.println(StringName.get(4));
        }catch (IndexOutOfBoundsException Index){
            //throw new ArrayIndexOutOfBoundsException("Array Exception:");
           System.out.println(StringName.add("Fahad:"));
        }


        for (String Names: StringName){
            System.out.println(Names);
        }
    }
}


/*import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringName = new ArrayList<>();
        stringName.add("Danial:");
        stringName.add("Obaid:");
        stringName.add("Riyaz:");
        stringName.add("Bango:");

        try {
            System.out.println(stringName.get(4));
        } catch (IndexOutOfBoundsException e) {
            // Throw ArrayIndexOutOfBoundsException without catching it here
            throw new ArrayIndexOutOfBoundsException("Array Exception:");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch ArrayIndexOutOfBoundsException here
            System.out.println("Alternate catch block: " + e.getMessage());
        }

        for (String names : stringName) {
            System.out.println(names);
        }
    }
}
*/