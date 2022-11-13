public class peopleTest {
    public static void main(String[] args) {


        person testPerson1 = new person("Liam");
        person testPerson2 = new person("Jack");


        people testPeople = new people();

        testPeople.addPerson(testPerson1);
        testPeople.addPerson(testPerson2);


        for (int i = 0; i <testPeople.size() + 1 ; i++) {
            testPeople.randomPerson();

        }




    }

}
