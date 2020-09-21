import org.junit.*;

public class jUnitTest {
    static int i=0;

    @Before
    public void beforeTest(){
        System.out.println("start test");
    }

    @After
    public void afterTest(){
        System.out.println("end test");
        i++;
    }

    @AfterClass
    public static void afterClassTest(){
        System.out.println("Runned "+i+" tests");
    }


    @Test
    public void testContractSetterGetter(){
        Contract con=new Contract();
        Player AaronJudge=new Player("Aaron Judge", "Rigthfielder", 500, 750, 100);
        Team NYY=new Team("New York Yankies", "American", "Central", 7);
        con.setContractDuration(5);
        Assert.assertEquals(5, con.getContractDuration(), 0);
        con.setContractPrice(100000);
        Assert.assertEquals(100000, con.getContractPrice(), 0);
        con.setPlayerName(AaronJudge);
        Assert.assertEquals("Aaron Judge", con.getPlayerName().getPlayerName());
        con.setTeamName(NYY);
        Assert.assertEquals("New York Yankies", con.getTeamName().getTeamName());
    }

    @Test
    public void testPlayerSetterGetter(){
        Player AaronJudge=new Player();
        AaronJudge.setAtBats(10);
        Assert.assertEquals(10, AaronJudge.getAtBats(), 0);
        AaronJudge.setHits(10);
        Assert.assertEquals(10, AaronJudge.getHits(), 0);
        AaronJudge.setPlayerName("Aaron Judge");
        Assert.assertEquals("Aaron Judge", AaronJudge.getPlayerName());
        AaronJudge.setPosition("Rigth fielder");
        Assert.assertEquals("Rigth fielder", AaronJudge.getPosition());
        AaronJudge.setRbi(3);
        Assert.assertEquals(3, AaronJudge.getRbi(), 0);
    }

    @Test
    public void testTeamSetterGetter(){
        Team NYY=new Team();
        NYY.setDivision("Central");
        Assert.assertEquals("Central", NYY.getDivision());
        NYY.setLeague("American");
        Assert.assertEquals("American", NYY.getLeague());
        NYY.setTeamName("New York Yankies");
        Assert.assertEquals("New York Yankies", NYY.getTeamName());
        NYY.setWins(7);
        Assert.assertEquals(7, NYY.getWins(), 0);
    }

    @Test
    public void testPlayerIsValid() {
        Assert.assertEquals(true, Player.playerIsValid("Aaron Judge", "Rigthfielder", 500, 750, 100));
        Assert.assertEquals(false, Player.playerIsValid(null, "Rigthfielder", 500, 750, 100));
        Assert.assertEquals(false, Player.playerIsValid("Aaron Judge", null, 500, 750, 100));
        Assert.assertEquals(false, Player.playerIsValid("Aaron Judge", "Rigthfielder", -1, 750, 100));
        Assert.assertEquals(false, Player.playerIsValid("Aaron Judge", "Rigthfielder", 500, -1, 100));
        Assert.assertEquals(false, Player.playerIsValid("Aaron Judge", "Rigthfielder", 500, 750, -1));
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
        Assert.assertEquals(false, Team.teamIsValid("New York Yankies", null, "Central", 7));
        Assert.assertEquals(false, Team.teamIsValid("New York Yankies", "American", null, 7));
        Assert.assertEquals(false, Team.teamIsValid("New York Yankies", "American", "Central", -1));
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
        Assert.assertEquals(false, Contract.contractIsValid(NYY, null,1000000, 5));
        Assert.assertEquals(false, Contract.contractIsValid(NYY, AaronJudge,-1, 5));
        Assert.assertEquals(false, Contract.contractIsValid(NYY, AaronJudge,1000000, -1));
    }

    @Test
    public void testGetContractPriceForYear(){
        Player AaronJudge=new Player("Aaron Judge", "Rigthfielder", 500, 750, 100);
        Team NYY=new Team("New York Yankies", "American", "Central", 7);
        Contract NYY_AaronJudge=new Contract(NYY, AaronJudge, 1000000, 5);
        Assert.assertEquals(200000, NYY_AaronJudge.getPriceForYear(), 0);
    }
}
