public class Task2_3_Salary {
    public static void main(String[] args) {
        double grossSalary = 250000.00;
        final double TAX_RATE = 0.075;   // 7.5%
        double deduction = 5000.00;
        double tax = grossSalary * TAX_RATE;
        double netSalary = grossSalary - tax - deduction;
        System.out.println("Gross salary : " + String.format("%.2f", grossSalary));
        System.out.println("Tax          : " + String.format("%.2f", tax));
        System.out.println("Deduction    : " + String.format("%.2f", deduction));
        System.out.println("Net salary   : " + String.format("%.2f", netSalary));
    }
}
