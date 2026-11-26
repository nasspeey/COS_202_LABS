public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() { return length; }
    public double getWidth()  { return width; }

    // Task 6.3: setters reject negative values
    public void setLength(double length) {
        if (length < 0) System.out.println("Invalid length (" + length + "): must not be negative. Value unchanged.");
        else this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0) System.out.println("Invalid width (" + width + "): must not be negative. Value unchanged.");
        else this.width = width;
    }

    public double area()      { return length * width; }
    public double perimeter() { return 2 * (length + width); }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}
