public class Task7_5_MathUtilTest {
    public static void main(String[] args) {
        for (int n : new int[]{1, 2, 17, 91, 97})
            System.out.println("isPrime(" + n + ") = " + MathUtil.isPrime(n));
        for (int n : new int[]{0, 1, 5, 10})
            System.out.println("factorial(" + n + ") = " + MathUtil.factorial(n));
        int[][] pairs = {{12, 18}, {100, 75}, {17, 5}, {48, 36}};
        for (int[] p : pairs)
            System.out.println("gcd(" + p[0] + ", " + p[1] + ") = " + MathUtil.gcd(p[0], p[1]));
        int[][] pw = {{2, 10}, {3, 4}, {5, 0}, {7, 3}};
        for (int[] p : pw)
            System.out.println("power(" + p[0] + ", " + p[1] + ") = " + MathUtil.power(p[0], p[1]));
    }
}
