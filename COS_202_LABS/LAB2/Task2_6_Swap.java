public class Task2_6_Swap {
    public static void main(String[] args) {
        int a = 10, b = 25;
        System.out.println("Before: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After : a = " + a + ", b = " + b);
    }
}
