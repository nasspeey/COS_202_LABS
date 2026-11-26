import java.util.Arrays;

public class Task8_2_ReverseAndCopy {
    public static void main(String[] args) {
        int[] a = {3, 8, 1, 9, 4, 7};
        System.out.println("Original          : " + Arrays.toString(a));

        System.out.print("Printed in reverse: ");
        for (int i = a.length - 1; i >= 0; i--) System.out.print(a[i] + " ");
        System.out.println();

        int[] rev = new int[a.length];
        for (int i = 0; i < a.length; i++) rev[i] = a[a.length - 1 - i];
        System.out.println("Reversed copy     : " + Arrays.toString(rev));
        System.out.println("Original unchanged: " + Arrays.toString(a));
    }
}
