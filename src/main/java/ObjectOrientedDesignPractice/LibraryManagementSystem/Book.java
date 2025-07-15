package ObjectOrientedDesignPractice.LibraryManagementSystem;

import lombok.Data;

@Data

public class Book {
    private String title;
    private String author;
    private String subject;
    private String isbn;
    private String publicationDate;

    public Book(String title, String author, String subject, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    // Additional methods can be added here if needed
}