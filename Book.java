public class Book {
    int id;
    String title;
    String author;
    boolean available;

    Book(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
	    this.author = author;
        this.available = available;
    }

    void display() {
	System.out.println(id + " | " + title + " | " + author + " | " + (available ? "Yes" : "No"));
    }
}
	