public class SpeedConverter {
    public static long speedinKm( double speedKmPer){
        if (speedKmPer<0){
            return -1;
        }
        else{
            return Math.round(speedKmPer/1.69);
        }
    }

    public static double printConversion(double speedKmPer){
        if (speedKmPer<0){
            System.out.println("Invalid Value");
            return speedKmPer;
        }
        long milePerhours = speedinKm(speedKmPer);
        System.out.println(milePerhours+" Miles per Hour " + speedKmPer + "Speedkm");
        return speedKmPer;

    }



    public static void main(String[] args) {
        System.out.println(printConversion(1.5));
        System.out.println(printConversion(10.25));
        System.out.println(printConversion(-5.67));

    }


}