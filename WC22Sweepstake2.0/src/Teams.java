import java.util.ArrayList;

public class Teams {

    private ArrayList<team> unpickedTeams;
    private team newTeam;

    public team getNewTeam() {
        return newTeam;
    }


    public Teams() {
        this.unpickedTeams = new ArrayList<team>();
    }

    public void addUnpickedTeams(team newTeam) {
        unpickedTeams.add(newTeam);

    }

    //PICK RANDOM TEAM, DISPLAY THEN REMOVE IT FROM LIST
    public void randomTeam() {

        int randomTeam;

        // generating the randomTeam
        randomTeam = (int) (Math.random() * unpickedTeams.size());

        //Print random team
        team randTeam = unpickedTeams.get(randomTeam);
        System.out.println(randTeam.getTeamName());
        //remove team from unpicked teams list
        unpickedTeams.remove(randTeam);

    }

    public void removeRandom() {

        // generating the randomTeam using Math.random()
        int randomTeam = (int) (Math.random() * unpickedTeams.size());

        team randTeam = unpickedTeams.get(randomTeam);

        //remove team from unpicked teams list
        unpickedTeams.remove(randTeam);
    }

    public void displayUnpickedTeams() {

        for (int i = 0; i < unpickedTeams.size(); i++) {
            team displayTeam = unpickedTeams.get(i);
            System.out.println(displayTeam.getTeamName());

        }
    }

    public int size() {
        return unpickedTeams.size();
    }

}
