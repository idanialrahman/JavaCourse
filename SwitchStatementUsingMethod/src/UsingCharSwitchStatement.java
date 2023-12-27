public class UsingCharSwitchStatement {
    public static String usingString( String myChar){
        switch (myChar){
            case "A":
                return "Hello This is A Found:";
            case "B":
                return "Hello This is the Part B:";
            case "y":
                return "Y is found:";

            default:
                return "This value is not found:"+myChar;
        }
    }
    public static void main(String[] args) {
        System.out.println(usingString("Z"));
        System.out.println(usingString("u"));
        System.out.println(usingString("A"));

    }
}
