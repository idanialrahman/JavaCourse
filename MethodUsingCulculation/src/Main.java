public class Main {
    public static void calculatingThe(int CarSpeed, boolean Value , int Subtotal, int boolingSpeed) {

        int totalOf= CarSpeed * Subtotal;
        int Estimate= totalOf + boolingSpeed;
        System.out.println("Estimate:" + Estimate);

        if (Estimate>=9000){
            System.out.println("Yes Working:" + Estimate+100);


        }

        else {
            System.out.println("Another :" + Estimate);
            int Tokyo = Estimate + 9000;
            System.out.println("Tokyo:" + Tokyo);
        }
    }
    public static void main(String[] args) {
        int boolingSpeed= 200;
        calculatingThe(80,true,70, 30);



    }
}
