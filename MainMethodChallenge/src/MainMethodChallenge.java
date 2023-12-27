public class MainMethodChallenge {
    public static void displayHighScorePosition(String PlayerName, int PlayerPosition){
        System.out.println("Danial Got Position in :  " + PlayerName);
        System.out.println("On the High Score List : " + PlayerPosition);
    }

    public static int calculateHighscoreposition( int playerScore){
        if (playerScore>100){
            return 1;
        } else if (playerScore>200 && playerScore>500) {
            return 2;
        } else if (playerScore>501 && playerScore<800) {
            return 3;
        }
        else {
            return 4;
        }

    }
    public static void main(String[] args) {
        int PlayerPosition = calculateHighscoreposition(800);
        displayHighScorePosition("Danial", PlayerPosition);

    }
}
