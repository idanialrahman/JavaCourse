class Sports {
    String PlayerName;
    private int PlayerNo;

    // Constructor
    public Sports(int playero, String PlayerN) {
        this.PlayerNo = playero;
        this.PlayerName = PlayerN;
    }

    // Default constructor
    public Sports() {

    }

    public int getPlayerNo() {
        return PlayerNo;
    }
}

class PlayerRanking extends Sports {
    private int RankNo;
    String TeamName;

    // Constructor
    public PlayerRanking(int playero, String PlayerN, int Rank, String TeamN) {
        super(playero, PlayerN);
        this.RankNo = Rank;
        this.TeamName = TeamN;
    }

    public int getRankNo() {
        return RankNo;
    }

    // Getter for TeamName
    public String getTeamName() {
        return TeamName;
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Sports obj = new Sports(90, "Virat");
        PlayerRanking obj2 = new PlayerRanking(90, "Virat", 32, "India");

        // Fixed the issue in the print statement
        System.out.println(obj.PlayerName+":"+obj.getPlayerNo());
        System.out.println(obj2.getRankNo() + ":" + obj2.getPlayerNo() + ":" + obj2.getTeamName()+ ":"+ obj2.PlayerName);
    }
}
