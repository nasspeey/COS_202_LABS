import java.util.Scanner;

public class Task4_4_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter operator (+ - * /): ");
        char op = in.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = in.nextDouble();
        switch (op) {
            case '+': System.out.println(a + " + " + b + " = " + (a + b)); break;
            case '-': System.out.println(a + " - " + b + " = " + (a - b)); break;
            case '*': System.out.println(a + " * " + b + " = " + (a * b)); break;
            case '/':
                if (b == 0) System.out.println("Error: division by zero.");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default: System.out.println("Error: unknown operator '" + op + "'.");
        }
        in.close();
    }
}
