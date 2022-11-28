public class Main {
    public static void main(String[] args) {


        FootballPlayer joe =new FootballPlayer("Joe");
        BaseBallPlayer pat =new BaseBallPlayer("Pat");
        SoccerPlayer beckham =new SoccerPlayer("Beckham");

        Team adelaideCrows =new Team("Adelide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
    }
}