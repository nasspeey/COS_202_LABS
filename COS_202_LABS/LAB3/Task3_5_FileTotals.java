import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3_5_FileTotals {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("scores.txt"));
        int sum = 0, count = 0;
        int largest = Integer.MIN_VALUE;
        while (file.hasNextInt()) {
            int v = file.nextInt();
            sum += v;
            count++;
            if (v > largest) largest = v;
        }
        file.close();
        System.out.println("Numbers read : " + count);
        System.out.println("Sum          : " + sum);
        System.out.println("Largest      : " + largest);
        System.out.printf("Average      : %.2f%n", (double) sum / count);
    }
}
