import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/** Robust versions of Task 3.5 and 3.6: no crash if a file is missing or cannot be written. */
public class Task3_7_RobustFiles {

    static void fileTotals(String fileName) {
        File f = new File(fileName);
        if (!f.exists()) {
            System.out.println("Sorry, the file '" + fileName + "' was not found. Please create it and try again.");
            return;
        }
        try (Scanner file = new Scanner(f)) {
            int sum = 0, count = 0, largest = Integer.MIN_VALUE;
            while (file.hasNext()) {
                if (file.hasNextInt()) {
                    int v = file.nextInt();
                    sum += v;
                    count++;
                    largest = Math.max(largest, v);
                } else {
                    System.out.println("Skipping non-integer value: " + file.next());
                }
            }
            if (count == 0) {
                System.out.println("The file has no numbers.");
                return;
            }
            System.out.println("Sum = " + sum + ", Largest = " + largest
                    + ", Average = " + String.format("%.2f", (double) sum / count));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open '" + fileName + "'.");
        }
    }

    static void writeNames(String fileName, Scanner in) {
        try (PrintWriter out = new PrintWriter(fileName)) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter name " + i + ": ");
                out.println(i + ". " + in.nextLine());
            }
            System.out.println("Saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Could not write to '" + fileName + "'.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Totals from scores.txt ---");
        fileTotals("scores.txt");
        System.out.println("--- Totals from missing.txt (does not exist) ---");
        fileTotals("missing.txt");
        System.out.println("--- Write names ---");
        writeNames("names.txt", in);
        in.close();
    }
}
