public class Task2_5_Overflow {
    public static void main(String[] args) {
        System.out.println("Integer.MAX_VALUE     = " + Integer.MAX_VALUE);
        System.out.println("MAX_VALUE + 1 (int)   = " + (Integer.MAX_VALUE + 1));
        long big = Integer.MAX_VALUE;
        System.out.println("MAX_VALUE + 1 (long)  = " + (big + 1));
        System.out.println();
        System.out.println("Explanation: an int uses 32 bits and holds at most 2147483647.");
        System.out.println("Adding 1 overflows and wraps around to the smallest value, -2147483648.");
        System.out.println("A long uses 64 bits, so 2147483648 fits and the result is correct.");
    }
}
