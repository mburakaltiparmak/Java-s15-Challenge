package Library.Person;

import Library.Book.Book;
import Library.Book.Books;

import java.time.LocalDate;

public class Librarian {
    private String name;
    private String password;

    public Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean verify_member(Member member, long member_id) {
        // Verilen üye nesnesinin üye ID'si verilen ID'ye eşitse true döndür
        return member.getMember_id() == member_id;
    }
    public Book search_book(Books books, String bookName) {
        for (Book book : books.getBooks()) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null;
    }
    public void return_book(Reader reader, Book book) {
        if (reader.books.contains(book)) {
            reader.return_book(book);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("You don't have this book.");
        }
    }

    //LocalDate chatgpt'den öğrenildi.
    public double calculate_fine(Reader reader, LocalDate date_of_purchase, int maxDays) {
        LocalDate currentDate = LocalDate.now();
        long diffInDays = java.time.temporal.ChronoUnit.DAYS.between(date_of_purchase, currentDate);
        double finePerDay = 0.50;
        double fine = 0;

        if (diffInDays > maxDays) {
            fine = finePerDay * (diffInDays - maxDays);
        }

        return fine;
    }

    public void create_bill(Reader reader, int maxDays) {
        double totalFine = 0;
        LocalDate currentDate = LocalDate.now();
        for (Book book : reader.books.getBooks()) {
            if (book.getStatus().equals("Borrowed")) {
                double fine = calculate_fine(reader, book.getDate_of_purchase(), maxDays);
                if (fine > 0) {
                    System.out.println("Fine for " + book.getName() + ": TL" + fine);
                    totalFine += fine;
                }
            }
        }
        if (totalFine > 0) {
            System.out.println("Total fine: TL" + totalFine);
        } else {
            System.out.println("No fines to pay.");
        }
    }





}
