import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareSort {
    String name;
    String surname;
    int age;

    CompareSort(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "CompareSort{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<CompareSort> lista = new ArrayList<>();
        lista.add(new CompareSort("Jan", "Kowalski", 23));
        lista.add(new CompareSort("Romek", "Ogonowski", 33));
        lista.add(new CompareSort("Atomek", "Mączynski", 24));
        lista.add(new CompareSort("Paweł", "Paxdzioch", 55));
        lista.add(new CompareSort("Magdalena", "Junkisz", 3));

        //wyswietlanie przed sortowaniem
        System.out.println("Before");
        for (CompareSort c : lista) {
            System.out.println(c);
        }
////////////////////////////////////////////////////////////////////////////
        //sortowanie po wieku
        Collections.sort(lista,new Comparator<CompareSort>) {
            @Override
            public int compare(CompareSort o1, CompareSort o2) {
                return o1.age-o2.age;
            }
        };
        for (CompareSort byName :lista){
            System.out.println(byName);
            }
/////////////////////////////////////////////////////////////////////////////
        }
    }

