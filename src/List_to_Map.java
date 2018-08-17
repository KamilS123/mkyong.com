import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List_to_Map {
    String name;
    String surname;
    int id;

    List_to_Map(String name, String surname, int id) {
        this.name=name;
        this.surname=surname;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "List_to_Map{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        List<List_to_Map>person = new ArrayList<>();
        person.add(new List_to_Map("Jan","Kowalski",3));
        person.add(new List_to_Map("Marek","Muniek",2));
        person.add(new List_to_Map("Olek","Abrota",1));
        person.add(new List_to_Map("Frane" +
                "k","Celinski",4));

        System.out.println("Wyswietlenie mapy");
        Map<Integer,String>personMap = person.stream()
                .collect(Collectors.toMap(List_to_Map::getId,List_to_Map::getName));
        System.out.println(personMap);

        //to samo co wyżej ale inna składnia
        System.out.println("\nWyswietlenie mapy sposob drugi\n");
        Map<Integer,String>personMap2 = person.stream()
                .collect(Collectors.toMap(s->s.getId(),s->s.getSurname()));
        System.out.println(personMap2);

    }
}
