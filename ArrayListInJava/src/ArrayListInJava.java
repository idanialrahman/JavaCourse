import javax.naming.Name;
import java.util.*;

public class ArrayListInJava {
    public static void main(String[] args) {
        List<String> Names = new ArrayList<>();
        Names.add("Vegetable:");
        Names.add("Elephant:");
        Names.add("Man-Goes:");

        System.out.println("We Need Output:");

        for (String Name:Names){
            System.out.println(Name);
        }


    }
}

