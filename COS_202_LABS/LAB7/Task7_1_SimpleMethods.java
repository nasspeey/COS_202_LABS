public class Task7_1_SimpleMethods {
    static int cube(int n) { return n * n * n; }
    static boolean isOdd(int n) { return n % 2 != 0; }
    static int maxOfThree(int a, int b, int c) {
        int m = a;
        if (b > m) m = b;
        if (c > m) m = c;
        return m;
    }

    public static void main(String[] args) {
        System.out.println("cube(4) = " + cube(4));
        System.out.println("isOdd(7) = " + isOdd(7) + ", isOdd(10) = " + isOdd(10));
        System.out.println("maxOfThree(8, 21, 13) = " + maxOfThree(8, 21, 13));
    }
}
