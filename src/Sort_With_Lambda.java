import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_With_Lambda {
    String name;
    String surname;
    int age;

    Sort_With_Lambda(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sort_With_Lambda{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

//wyswietlanie oryginalnej listy
        List<Sort_With_Lambda>listOriginal = wyswietl();
        for(Sort_With_Lambda display1 : listOriginal) {
            System.out.println(display1);
        }

        System.out.println("\n After sort by name\n");
//sortowanie po imieniu
        listOriginal.sort((Sort_With_Lambda s1, Sort_With_Lambda s2) -> s1.name.compareTo(s2.name));
        for(Sort_With_Lambda display2 : listOriginal) {
            System.out.println(display2);
        }

        System.out.println("\n After sort by surname\n");

//sortowanie po nazwisku
        listOriginal.sort((Sort_With_Lambda s1, Sort_With_Lambda s2)-> s1.surname.compareTo(s2.surname));
        for(Sort_With_Lambda display3 : listOriginal) {
            System.out.println(display3);
        }

        System.out.println("\n After sort by age\n");
//sortowanie po wieku

        listOriginal.sort((Sort_With_Lambda s1, Sort_With_Lambda s2)-> s1.age-s2.age);
            for(Sort_With_Lambda display4 : listOriginal) {
                System.out.println(display4);
            }
        

    }
    public static List<Sort_With_Lambda>wyswietl() {
        List<Sort_With_Lambda> result = new ArrayList<>();
        result.add(new Sort_With_Lambda("Jan", "Kowalski", 23));
        result.add(new Sort_With_Lambda("Romek", "Ogonowski", 33));
        result.add(new Sort_With_Lambda("Atomek", "Abracham", 24));
        result.add(new Sort_With_Lambda("Paweł", "Paxdzioch", 55));
        result.add(new Sort_With_Lambda("Magdalena", "Cenckiewicz", 3));
        return result;
    }
}
