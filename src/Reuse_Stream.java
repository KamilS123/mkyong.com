import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reuse_Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

       Integer str =  list.stream()
                .filter(s->s ==2)
                .findAny()
               .orElseGet(null);

       System.out.println(str);



    }
}
//niedokończne