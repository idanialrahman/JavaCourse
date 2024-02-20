import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

                set.add(20);
                set.add(90);
                set.add(99);
                set.add(89);





                Iterator<Integer> values = set.iterator();

                //for (int Num: set){

                   // System.out.println(Num);

                     while(values.hasNext()){
                      Integer Numbers= values.next();
                     System.out.println(Numbers);

                }
            }
        }