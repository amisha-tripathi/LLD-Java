package ObjectOrientedDesignPractice.LibraryManagementSystem;

import java.util.Date;

public class BookItem extends Book {
  private Rack placedAt;
  private String barCode;
  private boolean isReferenceOnly;
  private Date borrowedDate, dueDate, dateOfPurchase, publicationDate;
  private Double price;
  private BookFormat bookformat;
  private BookStatus bookStatus;

  public BookItem(String title, String author, String subject, String isbn, String publicationDate) {
    super(title, author, subject, isbn, publicationDate);
  }

    public boolean checkout(String memberId){
    if(this.isReferenceOnly) {
      System.out.println("This book is reference only and cannot be checked out.");
      return false;
    }
    BookLending.lendBook(this.barCode, memberId);
    updateBookItemStatus(BookStatus.CHECKED_OUT);
    return true;
    }

    public Rack getPlacedAt() {
        return placedAt;
    }
    public void updateBookItemStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
    public String getBarCode() {
        return barCode;
    }
    public void updateDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public boolean getIsReferenceOnly() {
        return isReferenceOnly;
    }
}