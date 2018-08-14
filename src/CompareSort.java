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
        lista.add(new CompareSort("Atomek", "Abracham", 24));
        lista.add(new CompareSort("Paweł", "Paxdzioch", 55));
        lista.add(new CompareSort("Magdalena", "Cenckiewicz", 3));

        //wyswietlanie przed sortowaniem
        System.out.println("Before");
        for (CompareSort c : lista) {
            System.out.println(c);
        }
        System.out.println("\n");
////////////////////////////////////////////////////////////////////////////
        //sortowanie po wieku
        Collections.sort(lista, new Comparator<CompareSort>() {
            @Override
            public int compare(CompareSort o1, CompareSort o2) {
                return o1.age - o2.age;
            }
        });
        for (CompareSort byName : lista) {
            System.out.println(byName);
        }
        System.out.println("\n");
//////////////////////////////////////////////////////////
        //wyswietlanie sortowanie po nazwisku
        List<CompareSort> newList = sortBySurname(lista);
        for (CompareSort disp : newList) {
            System.out.println(disp);
        }
        System.out.println("\n");
////////////////////////////////////////////////////////////
        //wyswietlanie sortowanie po imieniu
        List<CompareSort> listByName = sortByname(lista);
        for(CompareSort dis : listByName) {
            System.out.println(dis);
        }
    }

    /////////////////////////////////////////////////////////////////////////////
    //sortowanie po nazwisku
    public static List<CompareSort> sortBySurname(List<CompareSort> lista) {
        Collections.sort(lista, new Comparator<CompareSort>() {
            @Override
            public int compare(CompareSort c1, CompareSort c2) {
                return c1.surname.compareTo(c2.surname);

            }
        });
        return lista;
    }

    /////////////////////////////////////////////////////////////////////////////////
//sortowanie po imieniu
    public static List<CompareSort> sortByname(List<CompareSort> lista) {
        Collections.sort(lista, new Comparator<CompareSort>() {
            @Override
            public int compare(CompareSort o1, CompareSort o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        return lista;
    }
}

