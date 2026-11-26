import java.util.Scanner;

public class Task9_3_CharacterCounts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String s = in.nextLine().toLowerCase();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiou".indexOf(c) >= 0) vowels++;
            else if (c >= 'a' && c <= 'z') consonants++;
            else if (Character.isDigit(c)) digits++;
            else if (c == ' ') spaces++;
        }
        System.out.println("Vowels     : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Digits     : " + digits);
        System.out.println("Spaces     : " + spaces);
        in.close();
    }
}
