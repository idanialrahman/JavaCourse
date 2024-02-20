import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> Numbers = new HashMap<>();
        Numbers.put(0, 90);
        Numbers.put(1,900);
        Numbers.put(2,3232);
        Numbers.put(3,67);
        Numbers.put(4,78);


        System.out.println(Numbers.keySet());

        for(int Number : Numbers.keySet()){
            System.out.println(Number+" :"+ Numbers.get(Number));
        }
    }
}