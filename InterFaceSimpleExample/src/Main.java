 interface  ComputerS{
     void code();
}
class Laptop implements ComputerS{
    public void code(){
        System.out.println("Laptop: I need a Laptop for Code:");
    }
}
class DeskTop implements ComputerS{
    public void code(){
        System.out.println("Desktop:Is Smarter Then Laptop:");
    }
}

public class Main {
    public static void main(String[] args) {
        ComputerS lap= new Laptop();
        ComputerS Desc= new DeskTop();
        lap.code();
        Desc.code();


    }
}
