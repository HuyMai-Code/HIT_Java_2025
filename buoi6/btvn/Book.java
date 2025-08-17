package buoi6.btvn;

public class Book {
    public static int bookId;
    private int id;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;
    public Book(String title, String author, double price, Publisher publisher) {
        this.id = ++bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }
    public Book(String title, String author, double price) {
        this.id = ++bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher("Unknown", "Unknown");
    }
    public static int getBookId() {
        return bookId;
    }
    public static void setBookId(int bookId) {
        Book.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Book Id: " + getId() + ", Title: " + getTitle() + ", Tac gia: " + getAuthor() + ", Gia: " + getPrice() + " $");
    }
    public void displayInfo(boolean showPublisher) {
        if (showPublisher) {
            System.out.println("Thong tin nha xuat ban:");
            System.out.println("Ten: " + getPublisher().getName());
            System.out.println("Dia chi: " + getPublisher().getAddress());
        } else {
            System.out.println("Publisher: Unknown");
        }
    }
}
