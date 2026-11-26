public class Library {
    private Book[] books;
    private int size = 0;

    public Library(int capacity) { books = new Book[capacity]; }

    public void addBook(Book b) {
        if (size < books.length) books[size++] = b;
        else System.out.println("Library is full.");
    }

    private Book find(String isbn) {
        for (int i = 0; i < size; i++)
            if (books[i].getIsbn().equals(isbn)) return books[i];
        return null;
    }

    public void borrow(String isbn) {
        Book b = find(isbn);
        if (b == null) System.out.println("No book with ISBN " + isbn);
        else if (!b.isAvailable()) System.out.println("Sorry, '" + b.getTitle() + "' is already borrowed.");
        else { b.setAvailable(false); System.out.println("You borrowed '" + b.getTitle() + "'."); }
    }

    public void giveBack(String isbn) {
        Book b = find(isbn);
        if (b == null) System.out.println("No book with ISBN " + isbn);
        else if (b.isAvailable()) System.out.println("'" + b.getTitle() + "' was not borrowed.");
        else { b.setAvailable(true); System.out.println("Thank you for returning '" + b.getTitle() + "'."); }
    }

    public void printAll() {
        for (int i = 0; i < size; i++) System.out.println(books[i]);
    }
}
