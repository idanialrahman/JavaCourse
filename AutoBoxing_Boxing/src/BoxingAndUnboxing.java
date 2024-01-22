
public class BoxingAndUnboxing {
    public static void main(String[] args) {
        int num =90;
        Integer Num1= num; //AutoBoxing
        System.out.println( Num1);

        Integer Num2 = Num1;
        System.out.println(Num2);

        String str = "81";

        Integer Number= Integer.parseInt(str);
        System.out.println(Number*2);

        }
    }