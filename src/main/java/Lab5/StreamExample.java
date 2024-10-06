import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(new Person(true, "Person " + i, new Address("Street " + i, "City " + i, "State " + i)));
        }

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getName)
                        .thenComparing(p -> p.getAddress().getCity()))
                .collect(Collectors.toList());

        List<Person> filteredPeople = sortedPeople.stream()
                .filter(p -> p.getAddress().getCity().startsWith("City"))
                .filter(p -> p.getName().startsWith("Person"))
                .collect(Collectors.toList());
        List<String> names = filteredPeople.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
