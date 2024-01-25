import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Joseph", "Stalin", "Tyrant", 27045.78));
        people.add(new Employee("D'Jango", "Unchained", "Bounty Hunter", 50000.00));
        people.add(new Student("Ryan", "Gosling", 2.5));
        people.add(new Student("SpongeBob", "Squarepants", 3.0));
        printData(people);
    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            double paymentAmount = person.getPaymentAmount();
            System.out.println(person.toString() + " earns " + paymentAmount + " USD");
        }
    }
}