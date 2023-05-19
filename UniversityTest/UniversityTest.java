import java.util.*;
public class UniversityTest {
    public static void main(String[] args) {
        // Creating persons
        Person person1 = new Person("Alice", "Smith", 20);
        Person person2 = new Person("Eve", "Davis", 25);
        Student student1 = new Student("John", "Doe", 22);
        Employee employee1 = new Employee("Jane", "Johnson", 30);

        // Creating university and adding persons
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(student1);
        persons.add(employee1);

        University university = new University(persons);

        // Testing university methods
        System.out.println("Full Names: " + university.getFullNames());
        System.out.println("Oldest Person: " + university.getOldestPerson().getFullName());
        System.out.println("Youngest Person: " + university.getYoungestPerson().getFullName());

        ArrayList<Person> voters = university.getVoters();
        System.out.println("Voters:");
        for (Person voter : voters) {
            System.out.println("- " + voter.getFullName());
        }

        System.out.println("Number of Employees: " + university.getNumberOfEmployees());
    }
}

