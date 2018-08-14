import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter_Map {
    public static void main(String[] args) {
        Map<Integer,String>newMap7 = new HashMap<>();
        newMap7.putAll(filterJava7());

        System.out.println("\nJava 7\n");
//wybieranie wartosci w java 7
        String result = "";
        for(Map.Entry<Integer,String> entry : newMap7.entrySet()) {
            if("www.wp.pl".equals(entry.getValue())) {
                result = entry.getValue();
            }
        }
        System.out.println(result);

        System.out.println("\nJava 8\n");
//wybieranie konkretnego value java 8
        String result2 = newMap7.entrySet().stream()
                .filter(s->"www.onet.pl".equals(s.getValue()))
                .map(x->x.getValue())
                .collect(Collectors.joining());
        System.out.println(result2);

        System.out.println("\nPobieranie po value\n");
//wybieranie po kluczu do mapy
        Map<Integer,String>mapPair = newMap7.entrySet().stream()
                .filter(s->s.getKey()==2&& s.getValue().equals("www.onet.pl"))
                .collect(Collectors.toMap(x->x.getKey(), x->x.getValue()));
        System.out.println(mapPair);

        System.out.println("\nPobieranie po value\n");
//wybieranie po kluczu drugi sposób
        Map<Integer,String>mapPair2 = newMap7.entrySet().stream()
                .filter(s->s.getKey()==3)
                .

    }
    public static Map<Integer,String>filterJava7() {
        Map<Integer,String>map7 = new HashMap<>();
        map7.put(1,"www.wp.pl");
        map7.put(2,"www.onet.pl");
        map7.put(3,"www.interia.pl");
        return map7;
    }
}
