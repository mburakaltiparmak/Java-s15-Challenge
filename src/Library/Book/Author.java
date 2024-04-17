package Library.Book;

import Library.Book.Books;
import Library.Person.Person;

import java.util.List;

public class Author extends Person {
    private Books books;

    public Author(String name, Books books) {
        super(name);
        this.books = books;
    }

    @Override
    public String whoyouare() {
        return "I am an author named " + super.whoyouare();
    }

    public void setBooks(Books books) {
        this.books = books;
    }
    public void new_book(Book book) {
        books.getBooks().add(book);
    }

    public void show_book() {
        List<Book> bookList = books.getBooks();
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available books:");
            for (Book book : bookList) {
                System.out.println(book.getName());
            }
        }
    }
}
