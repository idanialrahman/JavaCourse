import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Danial:");
        list.add("Wajidullah:");
        list.add("Wasifullah:");
        list.add("Ayan:");


        System.out.println(list.get(3));

        System.out.println(list.set(0,"AryanKhan:"));


        for (String n: list){
            System.out.println(n);
        }
    }
}