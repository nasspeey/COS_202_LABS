public class Task5_8_FibonacciArmstrong {
    public static void main(String[] args) {
        System.out.println("First 20 Fibonacci numbers:");
        long a = 0, b = 1;
        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\n\nArmstrong numbers between 100 and 999:");
        for (int n = 100; n <= 999; n++) {
            int d1 = n / 100, d2 = (n / 10) % 10, d3 = n % 10;
            if (d1 * d1 * d1 + d2 * d2 * d2 + d3 * d3 * d3 == n) System.out.print(n + " ");
        }
        System.out.println();
    }
}
