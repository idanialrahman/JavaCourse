class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i<= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<= 5; i++) {
            System.out.println("I am Danial:");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<= 5; i++) {
                    System.out.println("AnonymousClass");
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };

        Runnable objA= new A();
        Thread tA= new Thread(objA);
        tA.start();
        Runnable objB= new B();
        Thread tB= new Thread(objB);
        tB.start();

        Thread tb3= new Thread(obj1);
        tb3.start();


    }
}