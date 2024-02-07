class A extends Thread {
    public void run(){
        for (int i=0; i<=100; i++){
            System.out.println("Hello:");
        }
    }
}
class B extends Thread {
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("Second:");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        A objA = new A();
        objA.start();
        B objB = new B();
        objB.start();

    }
}