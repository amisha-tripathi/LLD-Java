package ObjectOrientedDesignPractice.LibraryManagementSystem;

import java.util.Date;

public class Member extends Account {
    private Date dateOfMembership;
    private int totalBooksBorrowed;

    public Member(String accountId, Person person, String password, Date dateOfMembership) {
        super(accountId, person, password);
        this.dateOfMembership = dateOfMembership;
        this.totalBooksBorrowed = 0; // Initialize total books borrowed to 0
    }

    public static boolean getAllMembers() {
        // Logic to retrieve all members (e.g., from database)
        // For demonstration, returning true to indicate success
        System.out.println("All members retrieved successfully.");
        return true;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public int getTotalBooksBorrowed() {
        return totalBooksBorrowed;
    }

    private void incrementTotalBooksBorrowed() {
        this.totalBooksBorrowed++;
    }
    private void decrementTotalBooksBorrowed() {
        if (this.totalBooksBorrowed > 0) {
            this.totalBooksBorrowed--;
        }
    }

    public boolean checkoutBookItem(BookItem bookItem) {
        // Logic for borrowing a book
        if(this.getTotalBooksBorrowed() >= Constants.MAX_BOOKS_ISSUE_TO_A_USER) {
            System.out.println("You have reached the maximum limit of borrowed books.");
            return false;
        }

        BookReservation reservation = BookReservation.fetchReservation(bookItem.getBarCode());
        if(reservation != null && reservation.getMemberId()!= null && !reservation.getMemberId().equals(this.getAccountId())) {
            System.out.println("This book is reserved by another member.");
            return false;
        }else if(reservation != null && reservation.getMemberId() == null) {
            reservation.setMemberId(this.getAccountId());
            reservation.updateStatus(ReservationStatus.COMPLETED);
        }

        if(!bookItem.checkout(this.getAccountId())) {
            System.out.println("This book cannot be checked out.");
            return false;
        }
        this.incrementTotalBooksBorrowed();
        Catalog.removeBook(bookItem);
        return true;
    }

    public void returnBookItem(BookItem item) {
        // Logic for returning a book
        checkForFine(item);
        BookReservation reservation = BookReservation.fetchReservation(item.getBarCode());
        if(reservation!=null){
            reservation.updateStatus(ReservationStatus.RESERVED);
            reservation.sendBookAvailabilityNotification();
        }else{
            item.updateBookItemStatus(BookStatus.AVAILABLE);
            item.updateDueDate(null); // Clear due date on return
            this.decrementTotalBooksBorrowed();
            System.out.println("Book returned successfully: " + item.getTitle());
        }
        Catalog.addBook(item);
    }

    public boolean renewBookItem(BookItem bookItem) {
        // Logic for returning a book
        BookReservation reservation = BookReservation.fetchReservation(bookItem.getBarCode());
        if(reservation != null && reservation.getMemberId() != null && !reservation.getMemberId().equals(this.getAccountId())) {
            System.out.println("This book is reserved by another member and cannot be renewed.");
            this.decrementTotalBooksBorrowed();
            bookItem.updateBookItemStatus(BookStatus.RESERVED);
            reservation.sendBookAvailabilityNotification();
            Catalog.addBook(bookItem);
            return false;
        }else if(reservation!=null){
            reservation.updateStatus(
                ReservationStatus.COMPLETED
            );
        }

        BookLending.lendBook(bookItem.getBarCode(), this.getAccountId());
        bookItem.updateDueDate(
            new Date(System.currentTimeMillis() + Constants.MAX_LENDING_DAYS * 24 * 60 * 60 * 1000L)
        );
        System.out.println("Book renewed successfully: " + bookItem.getTitle());
        return true;
    }

    private void checkForFine(BookItem item){
        BookLending lending=BookLending.fetchLendingDetails(item.getBarCode());
        if(lending != null) {
            Date currentDate = new Date();
            if(currentDate.after(lending.getDueDate())) {
                long diffInMillies = currentDate.getTime() - lending.getDueDate().getTime();
                Fine.collectFine(item.getBarCode(), item.getBarCode(), diffInMillies);
                System.out.println("You have a fine of $"+ " for overdue book: " + item.getTitle());
            } else {
                System.out.println("No fine for book: " + item.getTitle());
            }
        } else {
            System.out.println("No lending record found for book: " + item.getTitle());
        }
    }

    public String getMemberId() {
        return this.getAccountId();
    }
}