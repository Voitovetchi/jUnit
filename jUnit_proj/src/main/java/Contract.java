import java.text.DecimalFormat;

public class Contract {

    private Team team;
    private Player player;
    private double contractPrice;
    private int contractDuration;

    Contract(){}

    Contract(Team teamName, Player playerName, double contractPrice, int contractDuration){
        this.player=playerName;
        this.team=teamName;
        this.contractPrice=contractPrice;
        this.contractDuration=contractDuration;
    }

    public void setPlayerName(Player playerName) {
        this.player = playerName;
    }
    public void setTeamName(Team teamName) {
        this.team = teamName;
    }
    public void setContractPrice(double contractPrice) {
        this.contractPrice = contractPrice;
    }
    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public Player getPlayerName() {
        return player;
    }
    public Team getTeamName() {
        return team;
    }
    public double getContractPrice() {
        return contractPrice;
    }
    public int getContractDuration() {
        return contractDuration;
    }

    //check if all given values are valid
    public static boolean contractIsValid(Team teamName, Player player, double contractPrice, int contractDuration){
        if(teamName!=null && player!=null && contractPrice>=0 && contractDuration>=0)
            return true;
        else
            return false;
    }

    public double getPriceForYear(){
        DecimalFormat df2 = new DecimalFormat("#.##");
        return Double.parseDouble(df2.format(this.contractPrice/this.contractDuration));
    }
}
