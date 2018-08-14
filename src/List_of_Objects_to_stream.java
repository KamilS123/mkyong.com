import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List_of_Objects_to_stream {
    String name;
    int salary;
    int age;

    public List_of_Objects_to_stream(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "List_of_Objects_to_stream{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<List_of_Objects_to_stream>person = new ArrayList<>();
        person.add(new List_of_Objects_to_stream("Kamil",1000,15));
        person.add(new List_of_Objects_to_stream("Jan",1254,111));
        person.add(new List_of_Objects_to_stream("Olek",1426,12));
        person.add(new List_of_Objects_to_stream("Wania",2588,16));
        person.add(new List_of_Objects_to_stream("Abracham",6000,28));

        System.out.println("\n Sposób java 8 \n");
        //wybieranie do nowej listy imion spodób java 8
        List<String>result = person.stream()
                .map(s->s.name)
                .sorted()           //sortuje
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("\n Sposób java 7 \n");
//wybieranie do nowej listy imion sposób java 7
        List<String>result7 = new ArrayList<>();
        for(List_of_Objects_to_stream s : person) {
            result7.add(s.name);
        }
        System.out.println(result7);
        }
}
