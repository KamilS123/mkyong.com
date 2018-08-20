import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List_To_Uppercase {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A","B","C","D"));

//zamiana na małe litery
        List<String>toLower = new ArrayList<>();
        for(String s : list) {
            toLower.add(s.toLowerCase());
        }
        System.out.println(toLower);

//zmiana na małe litery
        List<String>collect = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(collect);
//nowa lista
        List<Integer>numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
//sumowanie listy
        List<Integer>razy2 = numbers.stream()
                .map(n -> n *2)
                .collect(Collectors.toList());
        System.out.println(razy2);
    }
}
