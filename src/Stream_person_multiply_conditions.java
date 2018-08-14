import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_person_multiply_conditions {
    String name;
    int age;

    public Stream_person_multiply_conditions(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stream_person_multiply_conditions{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Stream_person_multiply_conditions>person = new ArrayList<>();
        person.add(new Stream_person_multiply_conditions("Janke",15));
        person.add(new Stream_person_multiply_conditions("Kamil",10));
        person.add(new Stream_person_multiply_conditions("Okaryna",16));
        person.add(new Stream_person_multiply_conditions("Muniek",12));

        Stream_person_multiply_conditions person1 = person.stream()
                .filter((s)->"Janke".equals(s.name)&& 15==s.age)
                .findAny()
                .orElse(null);
        System.out.println(person1);

    }
}
