import java.util.function.Function;

public class MainComparator {

    public static void main(String[] args) {

        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFname = (p1, p2) -> p2.getFirstName().compareTo(p1.getFirstName());
        Comparator<Person> cmpLname = (p1, p2) -> p2.getLastName().compareTo(p1.getLastName());

        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getLastName();
        Function<Person, String> f3 = p -> p.getFirstName();

        Comparator<Person> cmpAge1 = Comparator.comparing(p->p.getAge());//or f1 Person::getAge
        Comparator<Person> cmpLast = Comparator.comparing(Person::getLastName);

        
    }
}
