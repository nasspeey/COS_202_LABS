public class Task7_4_PassByValue {
    static void trySwap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside method : a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 5, y = 9;
        System.out.println("Before call   : x = " + x + ", y = " + y);
        trySwap(x, y);
        System.out.println("After call    : x = " + x + ", y = " + y);
        System.out.println();
        System.out.println("Explanation: Java passes primitives BY VALUE. The method receives copies of x and y,");
        System.out.println("so it swaps its own local copies only. The caller's variables are never touched.");
    }
}
