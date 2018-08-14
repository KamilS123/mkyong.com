import java.util.ArrayList;
import java.util.List;

public class Stream_Person {
    String name;
    int age;

    Stream_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "name ->>" + name +
                "age ->>" + age;
    }
    public static void main(String[] args) {
    List<Stream_Person>newPerson = displayList();

//finding just one name by findAny
    Stream_Person person1 = newPerson.stream()
    .filter(s->"Olek".equals(s.name))
    .findAny()
    .orElse(null);
        System.out.println(person1.name);

//finding just one age
    Stream_Person person2 = newPerson.stream()
            .filter(s->s.age==10)
            .findAny()
            .orElse(null);
        System.out.println(person2.age + "<->" + person2.name);

    }
    public static List<Stream_Person>displayList() {
        List<Stream_Person>person = new ArrayList<>();
        person.add(new Stream_Person("Kamil",15));
        person.add(new Stream_Person("Olek",56));
        person.add(new Stream_Person("Franek",10));
        person.add(new Stream_Person("Boguś",14));
        return person;
    }
}
