public class IfElseChallenge {
    public static void main(String[] args) {
        int score= 10000;
        int levelCompleted = 8;
        int bonusVariable= 200;
        boolean finalExpression = true;

        int Finalscore= score;

        if (finalExpression==true){
            Finalscore += (bonusVariable*levelCompleted);
            System.out.println("The Final Score:"+Finalscore);
        }
        else {
            System.out.println("Your entered value is wrong ");
        }
    }

}
