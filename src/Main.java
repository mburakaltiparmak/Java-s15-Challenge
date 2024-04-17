import Library.Book.Author;
import Library.Book.Book;
import Library.Book.Books;
import Library.Book.Category;
import Library.Person.Librarian;
import Library.Person.MemberType;
import Library.Person.Reader;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Books readerBooks = new Books();


        Books libraryBooks = new Books();
        Book book1 = new Book(new Author("John Doe", readerBooks), "123", "Sample Book 1", 19.99, "Available", "1st Edition", LocalDate.of(2024, 4, 17), Category.FICTION);
        Book book2 = new Book(new Author("Jane Doe", readerBooks), "456", "Sample Book 2", 14.99, "Available", "2nd Edition", LocalDate.of(2024, 4, 17), Category.MAGAZINES);
        libraryBooks.getBooks().add(book1);
        libraryBooks.getBooks().add(book2);


        Reader reader = new Reader("Alice", 123456789, MemberType.STUDENT, "2024-01-01", false, 5, "123 Main St", "555-5555", readerBooks);

        reader.purchase_book(new Book(new Author("John Doe", readerBooks), "789", "New Book", 24.99, "Available", "1st Edition", LocalDate.of(2024, 4, 17), Category.FICTION));


        reader.show_book();


        reader.borrow_book(book1);


        reader.return_book(book1);


        reader.show_actions();


        //Author için sadece isim alan bir constructor daha var
        Author author1 = new Author("John Doe");
        Author author2 = new Author("Jane Doe");
        Book book3 = new Book(author1, "123", "Sample Book 3", 19.99, "Available", "1st Edition", LocalDate.of(2022, 10, 15), Category.FICTION);
        Book book4 = new Book(author2, "456", "Sample Book 4", 14.99, "Available", "2nd Edition", LocalDate.of(2023, 5, 20), Category.MAGAZINES);
        System.out.println("Book 3:");
        System.out.println(book3);
        System.out.println("\nBook 4:");
        System.out.println(book4);
        Reader reader2 = new Reader("Alice", 123456789, MemberType.STUDENT, "2024-01-01", false, 5, "123 Main St", "555-5555", readerBooks);
        reader2.purchase_book(book3);
        reader2.borrow_book(book4);
        reader2.show_actions();
        reader2.show_book();

        System.out.println("\nReader's Books:");
    //Librarian
        Librarian librarian = new Librarian("Doğancan", "password123");




        // Bir kitap iade ediliyor
        librarian.return_book(reader2, book4);

        // Fatura oluşturuluyor
        int maxDays = 1;
        librarian.create_bill(reader2, maxDays);

        //Cezai işlem gereken durum
        readerBooks.getBooks().add(book1);
        readerBooks.getBooks().add(book2);
        Book borrowedBook = readerBooks.getBooks().get(0); // Bir kitap alındı
        borrowedBook.setDate_of_purchase(LocalDate.of(2024, 3, 17)); // Kitap satın alındı
        reader.show_book();
        librarian.create_bill(reader,maxDays);
    }
}
