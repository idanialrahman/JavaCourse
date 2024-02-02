class MyException extends Exception{
    public MyException(String Name){
        super(Name);
    }
}
public class Main {
    public static void main(String[] args) {
        int Array[] = new int[4];
        Array[2]=32;
        Array[1]=332;
        Array[0]=90;

        int j=0;

        try {
            int y= 334/5;
            System.out.println(y);
            if (y%2==0){
                throw new MyException("This will work");
            }

        }catch (MyException Myex){
            int y=332/12;
            System.out.println(y);
        }

    }
}