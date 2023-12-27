public class MethodOverloadingMinutesConverter {
    public static void main(String[] args) {
        System.out.println(convertTheSecondsIntoMinutesAndHours(60, 3850));
        System.out.println(convertTheSecondsIntoMinutesAndHours(23,43,23));

    }
    public static String convertTheSecondsIntoMinutesAndHours(int minuts, int seconds){
        int checkMinutesInSecond= seconds/60;
        int checkHoursInSeconds = checkMinutesInSecond/60;
        int remainingMinutes= seconds % 60;
        int remainingSeconds = seconds % 3600;

        return checkMinutesInSecond  + "||CheckMinutesinSeconds" + checkHoursInSeconds +"||CheckHourinSecond"
                + remainingMinutes+ "||remainingMinutes" + remainingSeconds + "||RemainingSeconds";
    }

    public static boolean convertTheSecondsIntoMinutesAndHours(int a, int b, int c ){
        if(a==b){
            System.out.println("Your enter values are Goods");

        } else if (b!=c) {
            System.out.println("yes You are Correct ");

        }
        else{
            System.out.println("Enter the Wrong Value");
        }
        return false;
    }

}
