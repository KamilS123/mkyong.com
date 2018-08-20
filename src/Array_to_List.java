import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_to_List {
    public static void main(String[] args) {
        int[]numbers = {1,2,3,4,5,6};

        //dodawanie elementów z numbers do list
        List<Integer> list = new ArrayList();
        for(int i : numbers) {
            list.add(i);
            System.out.println(i);
        }

        System.out.println("\n");

        //dodawanie elementów z number do listy przez streama
        List<Integer>list2 = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());
        for(Integer i : list2) {
            System.out.println(i);
        }
    }
}
