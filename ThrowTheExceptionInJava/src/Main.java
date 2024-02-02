
public class Main {
    public static void main(String[] args){

        int a=2;
        int Number[]= new int[4];
        Number[0]=1;
        Number[2]=4;

        try {
            int indexToAccess=5;

            if (indexToAccess>=0 && indexToAccess<Number.length){
                System.out.println(Number[indexToAccess]);

            }else {
                throw new ArrayIndexOutOfBoundsException();
            }
            int j= 90/a;
            System.out.println(j);
            if (a==0){
                throw new ArithmeticException();
            }


        }catch (ArrayIndexOutOfBoundsException Array ){
            System.out.println(Number[2]);
        }
        catch (ArithmeticException Math){
            int j= 90/2;
            System.out.println(j);
        }

    }
}