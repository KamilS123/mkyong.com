import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_to_List {
    public static void main(String[] args) {
        Map<String,String>mapa = new HashMap<>();
        mapa.put("jeden","dwa");
        mapa.put("trzy","cztery");

        //all map key to list
        List<String>list1 = new ArrayList(mapa.keySet());
        System.out.println(list1);

        //all map value to list
        List<String>list2 = new ArrayList(mapa.values());
        System.out.println(list2);

        //all map key to list
        List<String>list3 = mapa.values().stream()
                .collect(Collectors.toList());
        System.out.println(list3);

        //all map values to list
        List<String>list4 = mapa.keySet().stream()
                .collect(Collectors.toList());
        System.out.println(list4);

        //add all values to list except
        List<String>list5 = mapa.values().stream()
                .filter(s->!"dwa".equalsIgnoreCase(s))
                .collect(Collectors.toList());
        System.out.println(list5);
    }
}
