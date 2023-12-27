public class MethodWithReturn {

    public static int additionReturn (int a , int b){
        int  c=a+b;
        System.out.println("The output:" + c);
        return c;


    }
    public static void main(String[] args) {
        additionReturn(6,9);
    }
}
