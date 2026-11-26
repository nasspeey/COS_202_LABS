import java.util.Scanner;

public class Task9_5_Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String line = in.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("No words entered.");
            in.close();
            return;
        }
        String[] words = line.split("\\s+");
        String longest = words[0];
        for (String w : words) if (w.length() > longest.length()) longest = w;
        System.out.println("Number of words: " + words.length);
        System.out.println("Longest word   : " + longest);
        System.out.println("Words, one per line:");
        for (String w : words) System.out.println(w);
        in.close();
    }
}
