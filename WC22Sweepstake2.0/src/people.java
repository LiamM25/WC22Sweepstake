import java.util.ArrayList;

public class people {

    private ArrayList<person> peopleList;
    private person newPerson;

    public person getNewPerson() {
        return newPerson;
    }


    public people() {
        this.peopleList = new ArrayList<person>();
    }

    public void addPerson(person newPerson){
        peopleList.add(newPerson);
    }



    //PICK RANDOM PERSON AND REMOVE FROM THE LIST
    public void randomPerson() {

        // generating the random Person using Math.random()
        int randomPerson = (int) (Math.random() * peopleList.size());
        //Print random person
        person randPerson = peopleList.get(randomPerson);
        System.out.println(randPerson.getPersonName());
        //remove person from list
        peopleList.remove(randPerson);
    }

    public void displayPeople() {
        for (int i = 0; i < peopleList.size(); i++) {
            person displayPerson = peopleList.get(i);
            System.out.println(displayPerson.getPersonName());

        }
    }

    public void displayLastPerson(){
        person lastPerson = peopleList.get(0);
        System.out.println(lastPerson.getPersonName());
    }

    public int size(){
        return peopleList.size() +1;
    }


}
