import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("shuvo", "Dhaka", 18, 1745330624);
        Person p2 = new Person("x", "gaibandha", 35, 1745330625);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

        ISearcher citySearcher = new CitySeracher();
        ISearcher ageSearcher = new AgeSearcher();

        System.out.println("Persons living in Dhaka:");
        for (int i = 0; i < persons.size(); i++) {
            if (citySearcher.Cheackcondition(persons.get(i))) {
                System.out.println("NAME :" + persons.get(i).firstname);
                System.out.println("Phone No:" + persons.get(i).Phonenumber);
            }
        }

        System.out.println();
        System.out.println("*********************");
        System.out.println();

        System.out.println("Persons with age >=18:");
        for (int i = 0; i < persons.size(); i++) {
            if (ageSearcher.Cheackcondition(persons.get(i))) {
                System.out.println("NAME:" + persons.get(i).firstname);
            }
        }
    }
}

