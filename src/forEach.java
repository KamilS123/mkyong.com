import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class forEach {
    public static void main(String[] args) {

        System.out.println("\nMapa\n");
//tworzenie nowej mapy i wyswietlenie jej
        Map<String,Integer>mapa2 = new HashMap<>();
        mapa2.putAll(wyswietlMap());
        for(Map.Entry<String, Integer> m : mapa2.entrySet()) {
            System.out.println(m.getKey() + "->>>" + m.getValue());
        }

        System.out.println("\nLista\n");
//tworzenie nowej listy i wyswietlenie jej
        List<String>newList = wyswietlList();
        for(String l : newList) {
            System.out.println(l);
        }

        System.out.println("\nLista z lambda\n");
//wyswietlenie listy z lambda
        newList.forEach(newL->System.out.println(newList));

        System.out.println("\nLista z elementem\n");
//wyswietlanie wybranego elementu
        newList.forEach(item-> {
            if("C".equals(item))
                System.out.println(item);
        });

        System.out.println("\nLista z wszystkimi elementami\n");
//wyswietlanie wszystkiego z listy
        newList.forEach(System.out::println);

        System.out.println("\nLista z elementem przez stream\n");
//wyswietlenie listy przez stream
        newList.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);
    }
//for each and Map
    public static Map<String, Integer>wyswietlMap() {
        Map<String, Integer>dane = new HashMap<>();
        dane.put("A",100);
        dane.put("B",300);
        dane.put("C",200);
        dane.put("D",900);
        dane.put("E",150);

        return dane;
    }
//for each and List
    public static List<String>wyswietlList() {
        List<String>list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        return list;
    }
}
