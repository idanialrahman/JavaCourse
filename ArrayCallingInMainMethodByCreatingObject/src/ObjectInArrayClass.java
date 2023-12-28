import java.util.Arrays;

public class ObjectInArrayClass {

    String ArrayofNames[] = {"Abid", "Ayan", "Waleed", "Anfal", "Rahman", "Danial:"};

    public static void main(String[] args) {

        ObjectInArrayClass PrintNames = new ObjectInArrayClass();
        System.out.println("Output");
        String Names= Arrays.toString(PrintNames.ArrayofNames);
        System.out.println(Names);

    }
}
