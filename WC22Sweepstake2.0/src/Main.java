import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws inputValidationException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        people group = new people();
        LinkedList<team> pickedTeams;
        //teams list
        team team1 = new team("Qatar");
        team team2 = new team("Ecuador");
        team team3 = new team("Senegal");
        team team4 = new team("Netherlands");
        team team5 = new team("South Korea");
        team team6 = new team("England");
        team team7 = new team("Iran");
        team team8 = new team("USA");
        team team9 = new team("Wales");
        team team10 = new team("Argentina");
        team team11 = new team("Saudi Arabia");
        team team12 = new team("Mexico");
        team team13 = new team("Poland");
        team team14 = new team("France");
        team team15 = new team("Australia");
        team team16 = new team("Denmark");
        team team17 = new team("Tunisia");
        team team18 = new team("Spain");
        team team19 = new team("Costa Rica");
        team team20 = new team("Germany");
        team team21 = new team("Japan");
        team team22 = new team("Belgium");
        team team23 = new team("Canada");
        team team24 = new team("Morocco");
        team team25 = new team("Croatia");
        team team26 = new team("Brazil");
        team team27 = new team("Serbia");
        team team28 = new team("Switzerland");
        team team29 = new team("Cameroon");
        team team30 = new team("Portugal");
        team team31 = new team("Ghana");
        team team32 = new team("Uruguay");

        Teams listOfTeams = new Teams();
        listOfTeams.addUnpickedTeams(team1);
        listOfTeams.addUnpickedTeams(team2);
        listOfTeams.addUnpickedTeams(team3);
        listOfTeams.addUnpickedTeams(team4);
        listOfTeams.addUnpickedTeams(team5);
        listOfTeams.addUnpickedTeams(team6);
        listOfTeams.addUnpickedTeams(team7);
        listOfTeams.addUnpickedTeams(team8);
        listOfTeams.addUnpickedTeams(team9);
        listOfTeams.addUnpickedTeams(team10);
        listOfTeams.addUnpickedTeams(team11);
        listOfTeams.addUnpickedTeams(team12);
        listOfTeams.addUnpickedTeams(team13);
        listOfTeams.addUnpickedTeams(team14);
        listOfTeams.addUnpickedTeams(team15);
        listOfTeams.addUnpickedTeams(team16);
        listOfTeams.addUnpickedTeams(team17);
        listOfTeams.addUnpickedTeams(team18);
        listOfTeams.addUnpickedTeams(team19);
        listOfTeams.addUnpickedTeams(team20);
        listOfTeams.addUnpickedTeams(team21);
        listOfTeams.addUnpickedTeams(team22);
        listOfTeams.addUnpickedTeams(team23);
        listOfTeams.addUnpickedTeams(team24);
        listOfTeams.addUnpickedTeams(team25);
        listOfTeams.addUnpickedTeams(team26);
        listOfTeams.addUnpickedTeams(team27);
        listOfTeams.addUnpickedTeams(team28);
        listOfTeams.addUnpickedTeams(team29);
        listOfTeams.addUnpickedTeams(team30);
        listOfTeams.addUnpickedTeams(team31);
        listOfTeams.addUnpickedTeams(team32);

        int numberOfPeople = 0;
        boolean ok;

        //START
        System.out.println("----------WORLD CUP 2022 SWEEPSTAKE----------");
        Thread.sleep(2000);
        System.out.println("Each person will have the same amount of teams");
        Thread.sleep(2000);
        System.out.println("---left over teams will be randomly removed---");
        Thread.sleep(2000);
        System.out.println("-----Min players = 2 --- Max players = 8-----");
        System.out.println("---------------------------------------------");
        Thread.sleep(2000);
        do {
            try {
                System.out.print("How many people in sweepstake?: ");

                numberOfPeople = sc.nextInt();
                ok = true;

                if (numberOfPeople > 8 || numberOfPeople < 2){
                    System.out.println("Min players - 2 Max players - 8");
                    ok = false;
                }

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid input");
                ok = false;
            }
        } while (!ok);


        System.out.println("---------------------------------------------");
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            person newPerson = new person(name);
            group.addPerson(newPerson);
        }


        int groupSize = group.size();
        int teamsListSize = listOfTeams.size();
        int teamsPerPerson = teamsListSize / numberOfPeople;
        int teamsRequired = teamsPerPerson * groupSize;

        System.out.println("Each person will have " + teamsPerPerson + " teams!");
        Thread.sleep(2000);


        //MAKE LIST OF TEAMS CORRECT SIZE
        if (teamsListSize > teamsRequired) {
            for (int i = 0; i < teamsRequired; i++) {
                listOfTeams.removeRandom();
            }
        }

        for (int i = 1; i < groupSize; i++) {
            System.out.println("---------------");
            group.randomPerson();
            Thread.sleep(1000);
            System.out.println("---------------");
            for (int j = 0; j < teamsPerPerson; j++) {
                listOfTeams.randomTeam();
                Thread.sleep(1000);
            }
        }

        System.out.println("_______________");
        System.out.println("Good luck!");
        System.exit(0);
    }
}


