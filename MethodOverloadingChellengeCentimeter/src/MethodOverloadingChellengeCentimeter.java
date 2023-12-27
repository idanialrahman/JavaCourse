public class MethodOverloadingChellengeCentimeter {
    public static void main(String[] args) {
        System.out.println(hightIntoInchesAndCentimers(90,80));
        System.out.println(hightIntoInchesAndCentimers(89));

    }
    public static double hightIntoInchesAndCentimers(int hight, int inche){
        return ((hight * 12)+inche)* 2.56;
    }
    public static double hightIntoInchesAndCentimers(int inches){
        return inches * 2.56;
    }
}
