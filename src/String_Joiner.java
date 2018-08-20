import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class String_Joiner {
    public static void main(String[] args) {
        System.out.println(stringJoiner());
        System.out.println(stringJoin());
        System.out.println(collectorsJoin());
    }

    //StringJoiner łączy stringi, wskazujemy w parametrze czym ma je łączyć
    public static String stringJoiner() {
        StringJoiner sj = new StringJoiner(",","prefix- "," -sufix");  //może być bez poczatku (prefix) i końca (sufix)
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        String result = sj.toString();
        return result;
    }

    //String.join łączy Stringi
    public static String stringJoin() {
        String result = String.join("-", "Kamil", "Mączyński", "jabłko");

        List<String> list = Arrays.asList("Jeden", "Dwa", "Trzy");
        String res = String.join(":", list);
        return result + "-----" + res;
    }

    //collectors.join streamuje Liste i łączy jej elementy wskazanym łącznikiem
    public static String collectorsJoin() {
        List<String>list = new ArrayList<>(Arrays.asList("Jeden","Dwa","Trzy"));
        String result = list.stream()
                .collect(Collectors.joining("/"));
        return result;
    }

}
