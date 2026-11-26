public class Task6_7_LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library(10);
        lib.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", "111"));
        lib.addBook(new Book("Computer Networks", "Andrew Tanenbaum", "222"));
        lib.addBook(new Book("Cryptography and Network Security", "William Stallings", "333"));
        lib.printAll();
        System.out.println();
        lib.borrow("111");
        lib.borrow("111");      // already borrowed
        lib.borrow("999");      // does not exist
        lib.giveBack("111");
        lib.giveBack("222");    // was never borrowed
        System.out.println();
        lib.printAll();
    }
}
