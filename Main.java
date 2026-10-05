public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Harry Potter", "J.K. Rowling", true));
        library.addBook(new Book(2, "Alchemist", "Paulo Coelho", false));
        library.addBook(new Book(3, "Wings of Fire", "A.P.J. Abdul Kalam", true));

        System.out.println("LIBRARY BOOKS CATALOG");
        library.displayBooks();
    }
}