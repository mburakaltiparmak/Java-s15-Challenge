import Library.Book.Author;
import Library.Book.Book;
import Library.Book.Books;
import Library.Book.Category;
import Library.Person.MemberType;
import Library.Person.Reader;

public class Main {
    public static void main(String[] args) {

        Books readerBooks = new Books();


        Books libraryBooks = new Books();
        Book book1 = new Book(new Author("John Doe", readerBooks), "123", "Sample Book 1", 19.99, "Available", "1st Edition", "2024-04-17", Category.FICTION);
        Book book2 = new Book(new Author("Jane Doe", readerBooks), "456", "Sample Book 2", 14.99, "Available", "2nd Edition", "2024-04-17", Category.NON_FICTION);
        libraryBooks.getBooks().add(book1);
        libraryBooks.getBooks().add(book2);


        Reader reader = new Reader("Alice", 123456789, MemberType.STUDENT, "2024-01-01", false, 5, "123 Main St", "555-5555", readerBooks);

        reader.purchase_book(new Book(new Author("John Doe", readerBooks), "789", "New Book", 24.99, "Available", "1st Edition", "2024-04-17", Category.FICTION));


        reader.show_book();


        reader.borrow_book(book1);


        reader.return_book(book1);


        reader.show_actions();
    }
}
