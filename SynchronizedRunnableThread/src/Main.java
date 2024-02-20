class Counter{
    int counnter;
    public void incerment(){
        counnter++;
    }
}
class A extends Counter implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<=100; i++){
            int counter = 0;
            incerment();

        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter= new Counter();
        Runnable Run1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<=100; i++){
                    counter.incerment();
                }
            }
        };

        A aclass= new A();

        Thread t1 = new Thread(aclass);

        t1.start();




    }
}