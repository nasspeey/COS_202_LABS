public class Task7_6_Recursion {
    static int sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 1);
    }

    static long power(long base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    static String reverse(String s) {
        if (s.length() <= 1) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("sum(10)        = " + sum(10));
        System.out.println("power(2, 10)   = " + power(2, 10));
        System.out.println("reverse(\"recursion\") = " + reverse("recursion"));
    }
}
