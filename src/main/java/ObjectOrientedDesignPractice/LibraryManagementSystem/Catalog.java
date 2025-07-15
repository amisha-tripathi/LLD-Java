package ObjectOrientedDesignPractice.LibraryManagementSystem;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{
  static HashMap<String, Book> bookTitles=new HashMap<>();
  static HashMap<String, Book> bookAuthors=new HashMap<>();
  static HashMap<String, Book> bookSubjects=new HashMap<>();
  static HashMap<String, Book> bookByPublicationDates=new HashMap<>();

  Catalog(){
    // Constructor for Catalog, can initialize if needed
  }

    public static void addBook(Book book) {
        // Add book to the catalog
        bookTitles.put(book.getTitle().toLowerCase(), book);
        bookAuthors.put(book.getAuthor().toLowerCase(), book);
        bookSubjects.put(book.getSubject().toLowerCase(), book);
        bookByPublicationDates.put(book.getPublicationDate(), book);
    }

    public static void removeBook(Book book) {
        // Remove book from the catalog
        bookTitles.remove(book.getTitle().toLowerCase());
        bookAuthors.remove(book.getAuthor().toLowerCase());
        bookSubjects.remove(book.getSubject().toLowerCase());
        bookByPublicationDates.remove(book.getPublicationDate());
  }

  public static String getBooks() {
    // Return a string representation of all books in the catalog
    StringBuilder sb = new StringBuilder();
    for (Book book : bookTitles.values()) {
      sb.append(book.toString()).append("\n");
    }
    return sb.toString();
  }
    public List<Book> searchByTitle(String title) {
        // Implementation for searching by title
        return bookTitles.values().stream()
            .filter(book -> book.getTitle().equalsIgnoreCase(title))
            .toList();
    }
    @Override
    public List<Book> searchByAuthor(String author) {
        // Implementation for searching by author
        return bookAuthors.values().stream()
            .filter(book -> book.getAuthor().equalsIgnoreCase(author))
            .toList();
    }

    @Override
    public List<Book> searchBySubject(String subject) {
        // Implementation for searching by subject
        return bookSubjects.values().stream()
            .filter(book -> book.getSubject().equalsIgnoreCase(subject))
            .toList();
    }
    @Override
    public List<Book> searchByPubDate(String publicationDate) {
        // Implementation for searching by publication date
        return bookByPublicationDates.values().stream()
            .filter(book -> book.getPublicationDate().equalsIgnoreCase(publicationDate))
            .toList();
    }
}