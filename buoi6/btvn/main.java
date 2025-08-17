package buoi6.btvn;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Library lib = new Library();

        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("___________MENU___________");
            System.out.println("1. Them sach vao thu vien");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo tac gia");
            System.out.println("4. Xoa sach theo ma sach va hien thi ket qua");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Thao tac cua ban: ");
            int choose = sc.nextInt();
            sc.nextLine();
            ch = choose;
            if (ch == 1) {
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Co nha san xuat khong(1:co/ 0:khong): ");
                int pub = sc.nextInt();
                sc.nextLine();
                
                if (pub == 1) {
                    System.out.print("Ten nha san xuat: ");
                    String name = sc.nextLine();
                    System.out.print("Dia chi: ");
                    String address = sc.nextLine();
                    Book book = new Book(title, author, price, new Publisher(name, address));
                    lib.addBook(book);
                } else if (pub == 0) {
                    Book book = new Book(title, author, price);
                    lib.addBook(book);
                }  
            }
            if (ch == 2) {
                System.out.println("1. Hien thi them nha san xuat");
                System.out.println("0. Khong hien thi nha san xuat");
                System.out.print("(1/0): ");
                int select = sc.nextInt();
                boolean se = (select == 1);
                lib.displayAllBooks(se);
            }
            if (ch == 3) {
                System.out.print("Nhap ten tac gia: ");
                String author = sc.nextLine();
                lib.searchByAuthor(author);
            }
            if (ch == 4) {
                System.out.print("Nhap id sach muon xoa: ");
                int bookId = sc.nextInt();
                lib.removeBookById(bookId);
            }
        } while(ch != 5);

    }
}
