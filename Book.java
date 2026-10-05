public class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
	this.author =author;
    }

    void display() {
	System.out.println(id + " | " + title + " | " + author);
    }
}
	