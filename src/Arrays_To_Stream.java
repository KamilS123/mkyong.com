import java.util.Arrays;
import java.util.stream.Stream;

public class Arrays_To_Stream {
    public static void main(String[] args) {
        String[]arr = {"jeden","dwa","trzy","cztery","piec","szesc"};
        String str = Arrays.toString(arr);

        System.out.println("Bez konwersju do Stringa");
        System.out.println(arr);  //nie przekonwertowane do stringa

        System.out.println("\nPo konwersjji na do Stringa");
        System.out.println(str);        //przekonwertowane do stringa

        //array to stream i wyswietlenie wszystkich elementów
        System.out.println("\nArrays.stream(arr)");
        Stream<String>arrStream = Arrays.stream(arr);
        arrStream.forEach(s->System.out.println(s));

        System.out.println("\nMetoda Stream.of(arr)");
        Stream<String>MetodaStreamOf = Stream.of(arr);
        MetodaStreamOf.forEach(s->System.out.println(s));
    }
}
