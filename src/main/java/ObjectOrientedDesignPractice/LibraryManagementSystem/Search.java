package ObjectOrientedDesignPractice.LibraryManagementSystem;

import java.util.List;

public interface Search {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
    List<Book> searchBySubject(String isbn);
    List<Book> searchByPubDate(String genre);

}