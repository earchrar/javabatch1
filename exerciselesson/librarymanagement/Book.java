public class Book {
    int id;
    String title;
    String author;
    String category;
    boolean isBorrowed;
    String borrowerName;

    public Book(int id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isBorrowed = false;
        this.borrowerName = "-";
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Category: " + category + ", Status: " + (isBorrowed ? "Borrowed (" + borrowerName + ")" : "Available");
    }
}
