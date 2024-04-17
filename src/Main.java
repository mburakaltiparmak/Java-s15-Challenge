import Library.Book.Author;
import Library.Book.Book;
import Library.Book.Books;
import Library.Book.Category;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("John Doe", new Books());
        Book book1 = new Book(author, "123", "Sample Book", 19.99, "Available", "1st Edition", "2024-04-17", Category.FICTION);
        author.new_book(book1);
        author.show_book();



    }
}