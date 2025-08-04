package hw_3;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printInfo() {
        System.out.println("Book's title: " + this.title + "\nBook's author: " + this.author);
    }
}
