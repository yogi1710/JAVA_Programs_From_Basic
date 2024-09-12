// 
public class Book {
    String title;
    String author;
    String isbn;
    double price;

    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String args[]) {
        Book book1 = new Book("java Programming", "Siddu", "9038-363", 1800);
        Book book2 = new Book("pyhton Programming", "hari");
        Book book3 = new Book("AWS", "Manju", "98-33-87");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }

}