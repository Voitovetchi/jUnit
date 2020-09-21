import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    private String league;
    private String division;
    private int wins;

    private List<Player> players=new ArrayList<Player>();

    Team(){}

    Team(String teamName, String league, String division, int wins){
        this.teamName=teamName;
        this.league=league;
        this.division=division;
        this.wins=wins;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void setLeague(String league) {
        this.league = league;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }

    public String getTeamName() {
        return teamName;
    }
    public String getLeague() {
        return league;
    }
    public String getDivision() {
        return division;
    }
    public int getWins() {
        return wins;
    }

    //check if all given values are valid
    public static boolean teamIsValid(String teamName, String league, String division, int wins){
        if(teamName!=null && league!=null && division!=null && wins>=0)
            return true;
        else
            return false;
    }

    //add player to list
    public void addPlayer(Player player){
        players.add(player);
    }

    //get players number
    public int getPlayersNumber(){
        return players.size();
    }
}
