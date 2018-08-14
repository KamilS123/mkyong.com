import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_filter_collect {
    public static void main(String[] args) {
//creating ArrayList
        List<String>names = new ArrayList<>(Arrays.asList("Kamil","Janek","Marek","Konrad"));

//tworzenie listy i streamowanie jej
        List<String>result = names.stream()
                .filter(s-> !"Marek".equals(s))
                .collect(Collectors.toList());          //dodanie streama do nowej listy
        result.forEach(System.out::println);

        System.out.println("\n");

//drugi sposób wyswietlania
        for(String s : result)
            System.out.println(s);
    }

}
