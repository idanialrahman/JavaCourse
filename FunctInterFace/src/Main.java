@FunctionalInterface
interface FuncInterface{
    int run(int a, int b);
    }

class Calcuate implements FuncInterface{

    @Override
    public int run(int a, int b) {
        return a+b;
    }
}
public class Main {
    public static void main(String[] args) {
        Calcuate calcuate = new Calcuate();
        int result= calcuate.run(90,90);
        System.out.println(result);

        FuncInterface New = new FuncInterface() {
            @Override
            public int run(int a, int b) {
                return a*b;
            }
        };
        int output = New.run(90,3);
        System.out.println(output);

        }

    }
