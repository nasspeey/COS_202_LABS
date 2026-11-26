import java.util.Scanner;

public class Task5_3_FactorialAndPowers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n (0-20): ");
        int n = in.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("n must be between 0 and 20 (larger factorials overflow a long).");
        } else {
            long fact = 1;
            for (int i = 2; i <= n; i++) fact *= i;
            System.out.println(n + "! = " + fact);
            long power = 1;
            for (int i = 0; i < n; i++) power *= 2;
            System.out.println("2^" + n + " = " + power);
        }
        in.close();
    }
}
