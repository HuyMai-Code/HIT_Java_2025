package buoi6.btvn;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {}
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void displayAllBooks(boolean showPublisher) {
        System.out.println();
        System.out.println("Danh sach sach: ");
        for (int i = 0; i < books.size(); i++) {
            books.get(i).displayInfo();
            books.get(i).displayInfo(showPublisher);
            System.out.println("_____________________________________________");
        }
    }

    public void searchByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (author.equalsIgnoreCase(books.get(i).getAuthor())) {
                books.get(i).displayInfo();
            }
        }
    }
    public void removeBookById(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == bookId) {
                books.remove(i);
                System.out.println("Da xoa sach co Id: " + bookId);
                return;
            }
        }
        System.out.println("Id khong ton tai!!!");
    }
}
