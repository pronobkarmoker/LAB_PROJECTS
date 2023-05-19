import java.util.ArrayList;

class University {
    private ArrayList<Person> persons;

    public University(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public String getFullNames() {
        StringBuilder fullNames = new StringBuilder();
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person instanceof Student) {
                Student student = (Student) person;
                fullNames.append(student.getLastName()).append(", ").append(student.getFirstName());
            } else {
                fullNames.append(person.getFullName());
            }
            if (i < persons.size() - 1) {
                fullNames.append(", ");
            }
        }
        return fullNames.toString();
    }

    public Person getOldestPerson() {
        Person oldestPerson = null;
        int maxAge = Integer.MIN_VALUE;

        for (Person person : persons) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
                oldestPerson = person;
            }
        }

        return oldestPerson;
    }

    public Person getYoungestPerson() {
        Person youngestPerson = null;
        int minAge = Integer.MAX_VALUE;

        for (Person person : persons) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
                youngestPerson = person;
            }
        }

        return youngestPerson;
    }

    public ArrayList<Person> getVoters() {
        ArrayList<Person> voters = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= 18) {
                voters.add(person);
            }
        }
        return voters;
    }

    public int getNumberOfEmployees() {
        int count = 0;
        for (Person person : persons) {
            if (person instanceof Employee) {
                count++;
            }
        }
        return count;
    }
}
