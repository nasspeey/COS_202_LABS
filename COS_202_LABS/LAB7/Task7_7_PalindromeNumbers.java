public class Task7_7_PalindromeNumbers {
    static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println("Palindromic numbers from 100 to 999:");
        int count = 0;
        for (int n = 100; n <= 999; n++) {
            if (isPalindrome(n)) {
                System.out.print(n + " ");
                if (++count % 15 == 0) System.out.println();
            }
        }
        System.out.println("\nTotal: " + count);
    }
}
