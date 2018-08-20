import java.util.Random;

public class Generate_Random {
    public static void main(String[] args) {
        System.out.println(getRandomInRange(2,8));
        System.out.println(getRandom(2,9));

//wyswietla liczby z przedziału
        System.out.println("\nWyswietla liczby z przedziału i iteruje");
        for(int i = 0; i<10; i++) {
            System.out.println(getRandomInRange(5,10));
        }

    }
//używa new Random
    private static int getRandomInRange(int min, int max) {
        if(max<=min) {
            throw new IllegalArgumentException("Max musi być wieksze od min");
        }

        Random r = new Random();
        return r.nextInt((max-min)+1)+min;
    }

    //używa Math
    private static int getRandom(int min, int max) {
        if(max<=min){
            throw new IllegalArgumentException("Max musi byc wieksze od min");
        }

        return (int)(Math.random()*((max-min)+1))+min;
    }


}
