import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> Mapping = new HashMap<>();
        Mapping.put("Danial:", 90);
        Mapping.put("Faraz:", 91);
        Mapping.put("Ali", 92);
        Mapping.put("WajidAli:", 56);


        System.out.println(Mapping.keySet());

        for (String Map : Mapping.keySet() ){
            System.out.println(Map +""+ Mapping.get(Map));
        }


    }
}