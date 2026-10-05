public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Harry Potter", "J.K. Rowling"));
        library.addBook(new Book(2, "Alchemist", "Paulo Coelho"));
        library.addBook(new Book(3, "Wings of Fire", "A.P.J. Abdul Kalam"));

        System.out.println("LIBRARY BOOKS CATALOG");
        library.displayBooks();
    }
}