import java.util.Arrays;
import java.util.Random;

public class Task8_4_Sorting {
    static void bubbleSort(int[] a) {
        for (int pass = 0; pass < a.length - 1; pass++) {
            boolean swapped = false;
            for (int i = 0; i < a.length - 1 - pass; i++) {
                if (a[i] > a[i + 1]) {
                    int t = a[i]; a[i] = a[i + 1]; a[i + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min]) min = j;
            int t = a[i]; a[i] = a[min]; a[min] = t;
        }
    }

    static void test(String label, int[] data) {
        int[] b = data.clone(), s = data.clone(), ref = data.clone();
        bubbleSort(b);
        selectionSort(s);
        Arrays.sort(ref);
        System.out.println("== " + label + " ==");
        System.out.println("Input     : " + Arrays.toString(data));
        System.out.println("Bubble    : " + Arrays.toString(b));
        System.out.println("Selection : " + Arrays.toString(s));
        System.out.println("Arrays.sort: " + Arrays.toString(ref));
        System.out.println("Both match Arrays.sort? " + (Arrays.equals(b, ref) && Arrays.equals(s, ref)));
        System.out.println();
    }

    public static void main(String[] args) {
        test("Already sorted", new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        test("Reversed", new int[]{8, 7, 6, 5, 4, 3, 2, 1});
        Random r = new Random();
        int[] rnd = new int[10];
        for (int i = 0; i < rnd.length; i++) rnd[i] = r.nextInt(100);
        test("Random", rnd);
    }
}
