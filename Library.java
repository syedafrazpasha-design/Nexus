import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new
ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        System.out.println("\nID | Title | Author | Available");

        System.out.println("---------------------");

        for(Book book : books) {
            book.display();
        }
    }
}