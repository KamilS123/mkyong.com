import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Check_if_Array_contains_value {
    public static void main(String[] args) {
        String[]alphabet = new String[]{"A","B","C","D"};
        check(alphabet);
    }
    public static void check(String[]list) {
        List<String>lista = Arrays.asList(list);
//sprawdza warunek czy lista zawiera A
        if(lista.contains("A")) {
            System.out.println("Hello A");
        }
//sprawdza czy jest kilka warunków
        if(lista.containsAll(Arrays.asList("A","B"))) {
            System.out.println("hi A and B");
        }

//prymitywne sprawdzanie wartosci
        int[]listaInt = {1,2,10};
        boolean result = IntStream.of(listaInt).anyMatch(x->x==10);
        if(result) {
            System.out.println("Hi 10");
        } else {
            System.out.println("there is no number");
        }

        int[]probna = {3,6,8,65,4};
        boolean test = IntStream.of(probna).anyMatch(s->s==4);
        if(test) {
            System.out.println("Jest tu 4!!!");
        } else {
            System.out.println("Nie ma 4");
        }

    }
}
