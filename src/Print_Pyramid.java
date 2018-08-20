import java.util.Collections;
import java.util.stream.Collectors;

public class Print_Pyramid {
    public static void main(String[] args) {
        half_pyramid();
        full_pyramid();
        fullCompact();
        invertedPhyramid();
    }
    public static void half_pyramid() {
        System.out.println("Half pyramid");
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void full_pyramid() {
        System.out.println("Full pyramid");
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5-i; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void fullCompact() {
        System.out.println("Full compact");
        for(int i = 0; i<5; i++) {
            System.out.println(String.join("", Collections.nCopies(5-i," "))
            +String.join("",Collections.nCopies(2*i+1,"*")));
        }
    }

    public static void invertedPhyramid() {
        System.out.println("Inverted phyramid");
        for(int i = 5; i>0; i--) {
            System.out.println(String.join("",Collections.nCopies(5-i," "))
            +String.join("",Collections.nCopies(2*i-1,"*")));
        }
    }
}
