import java.util.Scanner;

public class Task3_4_BillFormatter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[3];
        double[] prices = new double[3];
        double total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Item " + (i + 1) + " name: ");
            names[i] = in.nextLine();
            System.out.print("Item " + (i + 1) + " price: ");
            prices[i] = Double.parseDouble(in.nextLine().trim());
            total += prices[i];
        }
        System.out.println();
        System.out.printf("%-5s %-20s %10s%n", "No.", "Item", "Price");
        System.out.println("-".repeat(37));
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-5d %-20s %10.2f%n", i + 1, names[i], prices[i]);
        }
        System.out.println("-".repeat(37));
        System.out.printf("%-26s %10.2f%n", "TOTAL", total);
        in.close();
    }
}
