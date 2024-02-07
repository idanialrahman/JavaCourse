

import static java.lang.Thread.*;

class A implements Runnable {
    public void run(){
        for (int i=0; i<=5; i++){
            System.out.println("Hello:");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}
class B implements Runnable {
    public void run(){
        for(int i=0; i<=5; i++){
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

        Runnable objA = new A();
        Thread t1 = new Thread(objA);


        Runnable objB = new B();
        Thread t2 = new Thread(objB);
        t2.start();
        t1.start();


    }
}