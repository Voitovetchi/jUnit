import java.text.DecimalFormat;

public class Player {

    private String playerName;
    private String position;
    private double hits;
    private double atBats;
    private double rbi;

    Player(){}

    Player(String name, String position, double hits, double atBats, double rbi){
        this.playerName=name;
        this.position=position;
        this.hits=hits;
        this.atBats=atBats;
        this.rbi=rbi;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setHits(int hits) {
        this.hits = hits;
    }
    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }
    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public String getPlayerName() {
        return playerName;
    }
    public String getPosition() {
        return position;
    }
    public double getHits() {
        return hits;
    }
    public double getAtBats() {
        return atBats;
    }
    public double getRbi() {
        return rbi;
    }

    //check if all given values are valid
    public static boolean playerIsValid(String name, String position, int hits, int atBats, int rbi){
        if(name!=null && position!=null && hits>=0 && atBats>=0 && rbi>=0)
            return true;
        else
            return false;
    }

    //get batting average for given player
    public double getAvg(){
        DecimalFormat df2 = new DecimalFormat("#.##");
        return Double.parseDouble(df2.format(this.hits/this.atBats));
    }

    //get batters raiting for given player
    public  double getBattersRaiting(){
        DecimalFormat df2 = new DecimalFormat("#.##");
        return Double.parseDouble(df2.format(this.getAvg()+this.rbi/this.atBats));
    }
}
