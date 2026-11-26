public class Task9_4_Palindromes {
    static boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) clean.append(Character.toLowerCase(c));
        }
        int i = 0, j = clean.length() - 1;
        while (i < j) {
            if (clean.charAt(i++) != clean.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {"A man, a plan, a canal: Panama", "Was it a car or a cat I saw?", "Hello, World", "Madam"};
        for (String t : tests)
            System.out.println("\"" + t + "\" -> " + isPalindrome(t));
    }
}
