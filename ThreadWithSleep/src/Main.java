import static java.lang.Thread.*;

class A extends Thread {
    public void run(){
        for (int i=0; i<=100; i++){
            System.out.println("Hello:");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}
class B extends Thread {
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("Second:");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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