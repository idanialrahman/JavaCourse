public class IfClass {
    public static void main(String[] args) {
        boolean myValue = true;
        if (myValue == false) {

            System.out.println("Hello The value is True");
        }

        int myInt = 10;
        if (myInt== 9){
            System.out.println("You are correct");
        }
        else{
            System.out.println("you are wrong");
        }
        int age= 100;
        if(age<=100){
            System.out.println("OMG");
        }
        if (age>=110 || age>=900){
            System.out.println("Yes Its Matter");
        }
        int score =200;
        int score2=170;
        if (score>= score2 && score2>=150){
            System.out.println("Pass");
        }
    }
}
