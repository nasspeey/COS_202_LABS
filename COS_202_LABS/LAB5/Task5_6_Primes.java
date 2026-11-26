public class Task5_6_Primes {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        for (int n = 2; n <= 100; n++) {
            boolean prime = true;
            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) { prime = false; break; }
            }
            if (prime) System.out.print(n + " ");
        }
        System.out.println();
    }
}
