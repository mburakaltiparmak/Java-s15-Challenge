package Library.Person;

import Library.Book.Book;
import Library.Book.Books;

import java.util.List;

public class Reader extends Member {

    private Books books;
    private List<String> actions; //Kullanıcının eylemlerini tutacak liste

    public Reader(String name, long member_id, MemberType member_type, String date_of_membership, boolean no_books_issued, int max_book_limit, String address, String phone_no, Books books, List<String> actions) {
        super(name, member_id, member_type, date_of_membership, no_books_issued, max_book_limit, address, phone_no);
        this.books = books;
        this.actions = actions;
    }
    public void purchase_book(Book book) {
        actions.add("Purchased book: " + book.getName());
    }
    //Kullanıcının ödünç almak istediği kitabı books'ta arar, eğer yoksa books'a ekler ve status Borrowed olarak değişir.Borrowed olarak actions listesine ekler.
    public void borrow_book(Book book) {
        if (books.getBooks().contains(book)) {
            System.out.println("You already have this book.");
        } else {
            if (book.getStatus().equals("Available")) {
                books.getBooks().add(book);
                book.setStatus("Borrowed");
                actions.add("Borrowed book: " + book.getName());
            } else {
                System.out.println("This book is not available for borrowing.");
            }
        }
    }
    //Kullanıcının iade etmek istediği kitabı books'ta arar, eğer mevcutsa books'tan kaldırır ve status değiştirir. Returned olarak actions listesine ekler.
    public void return_book(Book book) {
        if (books.getBooks().contains(book)) {
            books.getBooks().remove(book);
            book.setStatus("Available");
            actions.add("Returned book: " + book.getName());
        } else {
            System.out.println("You don't have this book.");
        }
    }
    public void show_book() {
        List<Book> bookList = books.getBooks();
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books owned by the reader:");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }
    public void show_actions() {
        System.out.println("Actions performed by the reader:");
        for (String action : actions) {
            System.out.println(action);
        }
    }
    @Override
    public String whoyouare() {
        return super.whoyouare();
    }
}
