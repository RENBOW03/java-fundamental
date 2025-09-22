package shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookStore {
    // NPE prevent
    public Optional<List<Book>> inquiryAllBook() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book 01", 100));
        books.add(new Book(2, "Book 02", 200));
        books.add(new Book(3, "Book 03", 300));

        return Optional.of(books);
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Optional<List<Book>> results = bookStore.inquiryAllBook();
        System.out.println("Result from inquiry: "+results);
        if (results.isPresent()) {
            List<Book> books = results.get();
            System.out.println(books);

            for(Book b: books){
                System.out.println(b);
            }
        }
    }
}
