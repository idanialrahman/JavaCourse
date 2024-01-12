import Packageim.Package;
import Packageim.GradingSystem;

public class Packges {
    public static void main(String[] args) {
        Package objeP= new Package();
        objeP.setName("Danial Rahman");
        objeP.add(90,90);
        GradingSystem objG = new GradingSystem();
        objG.setName("Danial Alam");
        objG.setRollno(908);
        Object marks = objG.Marks;
        marks= 30;


        System.out.println(objG.getName()+":"+objG.getRollno()+":"+ marks);
        System.out.println(objeP.add(455,43)+":"+ objeP.getName());


    }
}