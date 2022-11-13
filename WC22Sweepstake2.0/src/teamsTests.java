import java.util.Collection;

public class teamsTests {
    public static void main(String[] args) {

        team team1 = new team("Spain");
        team team2 = new team("Qatar");
        team team3 = new team("Ecuador");
        team team4 = new team("Poland");


        Teams test = new Teams();
        test.addUnpickedTeams(team1);
        test.addUnpickedTeams(team2);
        test.addUnpickedTeams(team3);
        test.addUnpickedTeams(team4);


        test.randomTeam();

        System.out.println("----------------");

        test.displayUnpickedTeams();
        System.out.println(test.size());

        System.out.println("--------------");
        for (int i = 0; i < test.size() ; i++) {
            test.randomTeam();
        }

    }
}
