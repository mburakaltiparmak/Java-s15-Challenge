package Library;

import Library.Book.Books;
import Library.Person.Reader;

import java.util.ArrayList;
import java.util.List;

public class Library {
private Books books;
private List <Reader> readers = new ArrayList<>();

    public Library(Books books, List<Reader> readers) {
        this.books = books;
        this.readers = readers;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }
}
