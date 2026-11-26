public class Task7_3_Overloading {
    static double area(double side)                 { return side * side; }              // square
    static double area(double length, double width) { return length * width; }           // rectangle
    static double area(int radius)                  { return Math.PI * radius * radius; } // circle (int radius)

    public static void main(String[] args) {
        System.out.println("Square (side 4.0)          : " + area(4.0));
        System.out.println("Rectangle (5.0 x 3.0)      : " + area(5.0, 3.0));
        System.out.println("Circle (radius 3)          : " + area(3));
    }
}
