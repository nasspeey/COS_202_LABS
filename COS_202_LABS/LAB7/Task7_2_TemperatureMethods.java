public class Task7_2_TemperatureMethods {
    static double celsiusToFahrenheit(double c) { return c * 9.0 / 5 + 32; }
    static double fahrenheitToCelsius(double f) { return (f - 32) * 5.0 / 9; }

    public static void main(String[] args) {
        System.out.printf("%10s %12s%n", "Celsius", "Fahrenheit");
        System.out.println("-".repeat(23));
        for (int c = 0; c <= 100; c += 10) {
            System.out.printf("%10d %12.1f%n", c, celsiusToFahrenheit(c));
        }
        System.out.println("\n98.6 F = " + String.format("%.1f", fahrenheitToCelsius(98.6)) + " C");
    }
}
