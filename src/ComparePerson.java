import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparePerson {
    String name;
    String surname;
    int age;

    ComparePerson(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ComparePerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
    //creating additional list
        List<ComparePerson>personList = getComparePeson();
        System.out.println("before start: ");
        for(ComparePerson c : personList) {
            System.out.println(c);
        }
///////////////////////////////////////////////////////////////
        //sorting by age
        Collections.sort(personList, new Comparator<ComparePerson>() {
            @Override                                                   //sortuje personList po wieku
            public int compare(ComparePerson o1, ComparePerson o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println("after sort: ");
        for(ComparePerson c : personList) {                 //wyswietlanie sortowania po wieku
            System.out.println(c);
        }
///////////////////////////////////////////////////////////////
    }
    public static List<ComparePerson> getComparePeson() {
        List<ComparePerson> list = new ArrayList<>();
        list.add(new ComparePerson("Kamil", "Superson", 45));
        list.add(new ComparePerson("Jan", "Kowalski", 78));
        list.add(new ComparePerson("Olek", "Moniuszko", 12));           //ustawienie listy w metodzie
        list.add(new ComparePerson("Maniek", "Jaki", 36));              //zwracajacej List<ComparePerson>
        list.add(new ComparePerson("Gustaw", "Wolski", 25));
        return list;
    }
}
