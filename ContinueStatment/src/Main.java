
public class Main {
    public static void main(String[] args) {
        int Number=0;
        while(Number<50){
            Number+=5;

            if(Number%25==0)
                continue;
            System.out.print(Number +"_");
        }
        }
    }
