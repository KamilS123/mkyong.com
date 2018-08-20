import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class GroupBy_List {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>(Arrays.asList("banana","apple","banana","apple","mango","mango","mango"));

        //liczenie ile razy powtarza sie wartosc w liscie
        Map<String,Long> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

        //sortuje po ilości wystąpień
        Map<String,Long>finalMap = new LinkedHashMap<>();
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e->finalMap.put(e.getKey(),e.getValue()));
        System.out.println(finalMap);



    }
}
