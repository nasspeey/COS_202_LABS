import java.util.Scanner;

public class Task3_2_Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter score 1: ");
        double a = in.nextDouble();
        System.out.print("Enter score 2: ");
        double b = in.nextDouble();
        System.out.print("Enter score 3: ");
        double c = in.nextDouble();
        System.out.printf("Average = %.1f%n", (a + b + c) / 3);
        in.close();
    }
}
