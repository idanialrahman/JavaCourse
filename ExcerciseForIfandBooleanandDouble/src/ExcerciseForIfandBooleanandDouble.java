public class ExcerciseForIfandBooleanandDouble {
    public static void main(String[] args) {
        double FirstValue= 80.00;
        double SecondValue=20.00;
        double ThirdM= FirstValue * SecondValue;
        System.out.println(ThirdM);
        double Division= ThirdM/40.00;
        System.out.println(Division);
        boolean Isremainder = (Division==0) ? true: false;
        System.out.println(Isremainder);
        if(!Isremainder){
            System.out.println(Division);
        }
    }
}

