public class MethodOverloading {
    public static int mathH(int a, int b) {
        System.out.println("Enter The Value :");
        return a + b;
    }

    public static int marthH(int a, int b, int c) {
        System.out.println("Enter the value :");
        return a + b + c;

    }

    public static int minusS(int a, int b) {
        System.out.println("Enter the Value : ");
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(marthH(90, 90, 30));
        System.out.println(mathH(30, 40));
        System.out.println(minusS(90, 800));
    }
}
