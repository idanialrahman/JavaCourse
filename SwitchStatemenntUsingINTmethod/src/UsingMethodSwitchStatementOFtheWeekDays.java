public class UsingMethodSwitchStatementOFtheWeekDays {
    public static void main(String[] args) {
        System.out.println(weekOftheDay(1));
        System.out.println(weekOftheDay(8));


    }

    public static String weekOftheDay(int Thedays){
        switch (Thedays){
            case 1:
                return "Monday";
            case 2:
                return "Sunday";
            case 7:
                return "Friday";
            default:
                return "Enter value is Not Valid:"+ Thedays;
        }
    }

}
