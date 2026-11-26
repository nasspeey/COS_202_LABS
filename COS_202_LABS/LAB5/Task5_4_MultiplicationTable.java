import java.util.Scanner;

public class Task5_4_MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Multiplication table of " + n);
        System.out.println("---------------------");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d x %2d = %6d%n", n, i, n * i);
        }
        in.close();
    }
}
