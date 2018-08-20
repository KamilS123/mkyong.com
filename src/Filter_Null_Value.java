import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter_Null_Value {
    public static void main(String[] args) {

        //otwarcie streama z danymi bezposrednio
        Stream<String>list = Stream.of("java",null,"javaScript","python","php",null);

        //przerzucenie streama do List i wyswietlenie
//        List<String>withNull = list.collect(Collectors.toList());
//        withNull.forEach(System.out::println);


        //przerzucenie streama do List i wyswietlenie bez null
        List<String>withoutNull = list.filter(s-> s!=null).collect(Collectors.toList());
        withoutNull.forEach(System.out::println);

    }
}
