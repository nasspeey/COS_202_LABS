public class Task6_1_RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(10.5, 4);
        System.out.println(r1 + "  area=" + r1.area() + "  perimeter=" + r1.perimeter());
        System.out.println(r2 + "  area=" + r2.area() + "  perimeter=" + r2.perimeter());
        System.out.println("r1 length via getter: " + r1.getLength() + ", width: " + r1.getWidth());
    }
}
