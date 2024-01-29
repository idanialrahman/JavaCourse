public class ArrayandObjectExceptionHandeling {
    public static void main(String[] args) {
        int a=2;
        int b ;
        int NUM[]= new int[5];
         try{
             b=20/a;
             System.out.println(NUM[3]);
             System.out.println(NUM[5]);
         }
         catch (ArithmeticException arm){
             System.out.println("Arithematic Exceptions:");
         }
         catch (ArrayIndexOutOfBoundsException Array){
             System.out.println("Array Missing:");
         }


    }
}