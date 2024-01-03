class Sports{
    String PlayerName;
    private String PlayerNo;

    public Sports(String PlayerN, String playero){
        this.PlayerName= PlayerN;
        this.PlayerNo= playero;

    }

    public Sports() {

    }

    public String getPlayerNo(){
        return PlayerNo;
}

}

class PlayerRanking extends Sports{
    private int RankNo;
    String TeamName;

    public PlayerRanking(int playero, String PlayerName, int Rank) {
        super(playero, PlayerName);
        this.RankNo=Rank;

    }
    public int getRankNo(){
        return RankNo;
    }
}


public class SuperConstructor {
    public static void main(String[] args) {
        Sports obj= new Sports();
        PlayerRanking obj2= new PlayerRanking(90, "Virat", 32);

    }
}