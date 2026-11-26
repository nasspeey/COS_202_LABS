import java.util.Random;

public class Task8_6_Frequency {
    public static void main(String[] args) {
        Random r = new Random();
        int[] counts = new int[7];          // indexes 1..6 used
        for (int i = 0; i < 60; i++) counts[r.nextInt(6) + 1]++;
        System.out.println("Face  Count");
        for (int face = 1; face <= 6; face++) {
            System.out.printf("%4d  %5d  %s%n", face, counts[face], "*".repeat(counts[face]));
        }
    }
}
