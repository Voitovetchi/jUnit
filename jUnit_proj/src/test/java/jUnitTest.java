import org.junit.Assert;
import org.junit.Test;

public class jUnitTest {

    @Test
    public void testPlayerIsValid() {
        Assert.assertEquals(true, Player.playerIsValid("Aaron Judge", "Rigthfielder", 500, 750, 100));
        Assert.assertEquals(false, Player.playerIsValid(null, "Rigthfielder", 500, 750, 100));
    }

    @Test
    public void testGetAvg(){
        Player AaronJudge=new Player("Aaron Judge", "Rigthfielder", 500, 750, 100);
        Assert.assertEquals(0.67, AaronJudge.getAvg(), 0);
    }

    @Test
    public void testGetBattersRaiting(){
        Player AaronJudge=new Player("Aaron Judge", "Rigthfielder", 500, 750, 100);
        Assert.assertEquals(0.80, AaronJudge.getBattersRaiting(),0);
    }

    @Test
    public void testTeamIsValid() {
        Assert.assertEquals(true, Team.teamIsValid("New York Yankies", "American", "Central", 7));
        Assert.assertEquals(false, Team.teamIsValid(null, "American", "Central", 7));
    }

    @Test
    public void testGetPlayersNumber(){
        Player AaronJudge=new Player("Aaron Judge", "Rigthfielder", 500, 750, 100);
        Team NYY=new Team("New York Yankies", "American", "Central", 7);
        NYY.addPlayer(AaronJudge);
        Assert.assertEquals(1, NYY.getPlayersNumber(), 0);
    }

    @Test
    public void testContractIsValid() {
        Player AaronJudge=new Player("Aaron Judge", "Rigthfielder", 500, 750, 100);
        Team NYY=new Team("New York Yankies", "American", "Central", 7);
        Assert.assertEquals(true, Contract.contractIsValid(NYY, AaronJudge,1000000, 5));
        Assert.assertEquals(false, Contract.contractIsValid(null, AaronJudge,1000000, 5));
    }

    @Test
    public void testGetContractPriceForYear(){
        Player AaronJudge=new Player("Aaron Judge", "Rigthfielder", 500, 750, 100);
        Team NYY=new Team("New York Yankies", "American", "Central", 7);
        Contract NYY_AaronJudge=new Contract(NYY, AaronJudge, 1000000, 5);
        Assert.assertEquals(200000, NYY_AaronJudge.getPriceForYear(), 0);
    }
}
