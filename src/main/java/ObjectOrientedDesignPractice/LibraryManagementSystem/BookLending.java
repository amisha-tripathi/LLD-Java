package ObjectOrientedDesignPractice.LibraryManagementSystem;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookLending {
    private String bookBarCode;
    private String memberId;
    private Date creationDate;
    private Date returnDate;
    private Date dueDate;

    public BookLending(String bookId, String userId, Date lendingDate, Date returnDate) {
        this.bookBarCode = bookId;
        this.memberId = userId;
        this.creationDate = lendingDate;
        this.returnDate = returnDate;
    }
    static Map<String, BookLending> bookLendingMap = new HashMap<>();

    public static void lendBook(String bookBarCode, String memberId) {
        Date currentDate = new Date();
        Date dueDate = new Date(currentDate.getTime() + (14 * 24 * 60 * 60 * 1000)); // 14 days from now
        BookLending bookLending = new BookLending(bookBarCode, memberId, currentDate, dueDate);
        // Store the book lending information in the map
        bookLendingMap.put(bookBarCode, bookLending);
    }
    public static BookLending getBookLending(String bookBarCode) {
        return bookLendingMap.get(bookBarCode);
    }
    public static BookLending fetchLendingDetails(String bookBarCode) {
        BookLending bookLending = bookLendingMap.get(bookBarCode);
        if (bookLending != null) {
            return bookLending;
        } else {
            System.out.println("No lending record found for book with barcode: " + bookBarCode);
            return null;
        }

    }

    public Date getDueDate() {
        return dueDate;
    }
}