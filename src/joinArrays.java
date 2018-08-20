

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class joinArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(joinStringArrays()));
        System.out.println(Arrays.toString(joinIntArrays()));
        System.out.println(Arrays.toString(join3Arrays()));
        System.out.println(Arrays.toString(joinArrays()));

    }

//łaczy tablice stringów w jedną
    public static String[] joinStringArrays() {
        String s1[] = {"jeden","dwa","trzy"};
        String s2[] = {"cztery","piec","szesc"};
        String s3[] = {"siedem","osiem","dziewiec"};

        String[]result = Stream.of(s1,s2,s3)
                .flatMap(Stream::of)
                .toArray(String[]::new);
        return result;
    }

 //łączy 2 tablice intów w jedną
    public static int[]joinIntArrays() {
        int[] i1 = {1,2,3};
        int[] i2 = {4,5,6};
        int[] i3 = {7,8,9};
        int[]result = IntStream.concat(Arrays.stream(i1),Arrays.stream(i2)).toArray();
        return result;
    }

//łaczy 3 tablice intów w jedną
    public static int[] join3Arrays() {
        int[] i1 = {1,2,3};
        int[] i2 = {4,5,6};
        int[] i3 = {7,8,9};
        int[]result = IntStream.concat(Arrays.stream(i1),IntStream.concat(Arrays.stream(i2),Arrays.stream(i3))).toArray();
        return result;
    }

//łączy dowolna ilość w jedną tablice
    public static int[] joinArrays() {
        int[]i1 = {1,2,3};
        int[]i2 = {4,5,6};
        int[]i3 = {7,8,9};
        int[]i4 = {10,11,12};
        int[]i5 = {13,14,15};
        int[]result = Stream.of(i1,i2,i3,i4,i5)
                .flatMapToInt(IntStream::of)
                .toArray();
        return result;
    }
}
