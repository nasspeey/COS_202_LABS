import java.util.Scanner;

public class Task9_7_Cipher {
    static String shiftText(String text, int shift) {
        shift = ((shift % 26) + 26) % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) sb.append((char) ('A' + (c - 'A' + shift) % 26));
            else if (Character.isLowerCase(c)) sb.append((char) ('a' + (c - 'a' + shift) % 26));
            else sb.append(c);
        }
        return sb.toString();
    }

    static String encrypt(String text, int shift) { return shiftText(text, shift); }
    static String decrypt(String text, int shift) { return shiftText(text, -shift); }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message: ");
        String msg = in.nextLine();
        System.out.print("Enter shift: ");
        int shift = in.nextInt();
        String enc = encrypt(msg, shift);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + decrypt(enc, shift));
        in.close();
    }
}
