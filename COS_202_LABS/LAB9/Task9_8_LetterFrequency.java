import java.util.Scanner;

public class Task9_8_LetterFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a paragraph (finish with an empty line):");
        StringBuilder text = new StringBuilder();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.isEmpty()) break;
            text.append(line).append(' ');
        }
        int[] freq = new int[26];
        String s = text.toString().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') freq[c - 'a']++;
        }
        System.out.println("\nLetter  Count");
        for (int i = 0; i < 26; i++) {
            System.out.printf("  %c     %5d  %s%n", (char) ('a' + i), freq[i], "*".repeat(freq[i]));
        }
        in.close();
    }
}
