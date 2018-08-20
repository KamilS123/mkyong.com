import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sortowanie_Mapy {
    public static void main(String[] args) {
        //mapa nieposortowana
        Map<String,Integer>unsortedMap = new HashMap<>();
        unsortedMap.put("jeden",2);
        unsortedMap.put("dwa",1);
        unsortedMap.put("trzy",5);
        unsortedMap.put("cztery",3);
        unsortedMap.put("pięć",4);
        System.out.println("Nieposortowana lista");
        System.out.println(unsortedMap);

        System.out.println("\nSortowanie po kluczach i umieszczanie w linkedHashMap");
    //mapa posortowana po kluczach do linkedHashMap
        Map<String,Integer> result = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
        (oldValue, newValue)->oldValue,LinkedHashMap::new));
        System.out.println(result);

        System.out.println("\nSortowanie po kluczy i umieszczanie w LinkedHashMap");
        //alternatywa sortowanie mapy po kluzach niepolecane
        Map<String, Integer> result2 = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(s->result2.put(s.getKey(),s.getValue()));
        System.out.println(result2);

        System.out.println("\nSortowanie po value i umieszczenie w linkedHashMap dla porządku");
        //mapa sortowana po wartosciach
        Map<String,Integer>sort_Po_Wartosciach = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (oldValue,newValue)->oldValue,LinkedHashMap::new));
        System.out.println(sort_Po_Wartosciach);

        System.out.println("\nSortowanie po value i umieszczenie w linkedHashMap dla porządku");
//mapa sortowana po wartosciach drugi sposób
        Map<String,Integer>sort_value_second = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(s->sort_value_second.put(s.getKey(),s.getValue()));
        System.out.println(sort_value_second);
    }
}
