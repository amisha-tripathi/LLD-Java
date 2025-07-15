package ObjectOrientedDesignPractice.LibraryManagementSystem;

import java.util.Date;

public class LibrarySystem {
    public static void main(String[] args) {
        // Example usage of the library management system
        System.out.println("Welcome to the Library Management System!");

        // You can create instances of Book, Member, and other classes here
        // and call their methods to simulate library operations.

        // For example:
         Book book = new Book("Effective Java", "Joshua Bloch", "Programming", "978-0134686097", "2018-01-11");
         System.out.println(book);

        // Create a book item
        BookItem bookItem = new BookItem("Effective Java", "Joshua Bloch", "Programming", "978-0134686097", "2018-01-11");
        bookItem.setPublicationDate("2018-01-11");
        System.out.println("Book Item Created: " + bookItem);

        // Create a member
        Member member = new Member("123", new Person(new Address("hoodi", "Bangalore")), "password123", new Date());
        System.out.println("Member Created: " + member);

        // Member checks out a book item
        boolean checkoutSuccess = member.checkoutBookItem(bookItem);
        if (checkoutSuccess) {
            System.out.println("Book checked out successfully!");
        } else {
            System.out.println("Failed to check out the book.");
        }

        // Fetch lending details
        BookLending lendingDetails = BookLending.fetchLendingDetails(bookItem.getBarCode());
        if (lendingDetails != null) {
            System.out.println("Lending Details: " + lendingDetails);
        } else {
            System.out.println("No lending details found for the book.");
        }

        // Create a book reservation
        BookReservation reservation = new BookReservation(ReservationStatus.PENDING, null, new Date(), bookItem.getBarCode());
        BookReservation.reservations.put(bookItem.getBarCode(), reservation);
        System.out.println("Book Reservation Created: " + reservation);

        // Member returns the book item
        member.returnBookItem(bookItem);
        System.out.println("Book returned successfully!");
        // Check the updated lending details
        lendingDetails = BookLending.fetchLendingDetails(bookItem.getBarCode());
        if (lendingDetails != null) {
            System.out.println("Updated Lending Details: " + lendingDetails);
        } else {
            System.out.println("No lending details found for the book after return.");
        }
        // Send notification about book availability
        reservation.sendBookAvailabilityNotification();
        // Update the reservation status
        reservation.updateStatus(ReservationStatus.COMPLETED);
        System.out.println("Reservation status updated to: " + reservation.getStatus());
        // Renew the book item
        boolean renewSuccess = member.renewBookItem(bookItem);
        if (renewSuccess) {
            System.out.println("Book renewed successfully!");
        } else {
            System.out.println("Failed to renew the book.");
        }
        // Check the updated lending details after renewal
        lendingDetails = BookLending.fetchLendingDetails(bookItem.getBarCode());
        if (lendingDetails != null) {
            System.out.println("Updated Lending Details after renewal: " + lendingDetails);
        } else {
            System.out.println("No lending details found for the book after renewal.");
        }
        // Print the final state of the book item
        System.out.println("Final Book Item State: " + bookItem);
        // Print the final state of the member
        System.out.println("Final Member State: " + member);
        // Print the final state of the reservation
        System.out.println("Final Reservation State: " + reservation);
        // Print the final lending details
        System.out.println("Final Lending Details: " + lendingDetails);
        // Print the final state of the catalog
        System.out.println("Final Catalog State: " + Catalog.getBooks());
        // Print the final state of book reservations
        System.out.println("Final Book Reservations: " + BookReservation.reservations);
        // Print the final state of book lendings
        System.out.println("Final Book Lendings: " + BookLending.bookLendingMap);
        // Print the final state of fines
        System.out.println("Final Fines: " + Fine.getFines());
        // Print the final state of the library system
        System.out.println("Library Management System operations completed successfully!");
        // You can add more operations and test cases as needed
        // For example, you can add more books, members, and perform various operations
        // like searching for books, listing all members, etc.
        // This is just a basic example to demonstrate the functionality of the library management system.
        System.out.println("Thank you for using the Library Management System!");



            System.out.println("Welcome to the Library Management System!");

            // Add more books to the catalog
            Book book1 = new Book("Clean Code", "Robert C. Martin", "Programming", "978-0132350884", "2008-08-01");
            Book book2 = new Book("Design Patterns", "Erich Gamma", "Software Engineering", "978-0201633610", "1994-10-21");
            Catalog.addBook(book1);
            Catalog.addBook(book2);
            System.out.println("Books added to catalog: " + Catalog.getBooks());

            // Add more members
            Member member1 = new Member("456", new Person(new Address("Whitefield", "Bangalore")), "password456", new Date());
            Member member2 = new Member("789", new Person(new Address("Indiranagar", "Bangalore")), "password789", new Date());
            System.out.println("Members created: " + member1 + ", " + member2);

            // Perform book search
            System.out.println("Searching for books by title 'Clean Code':");
            Catalog c=new Catalog();
            System.out.println(c.searchByTitle("Clean Code"));

            // Member 1 checks out a book item
            BookItem bookItem1 = new BookItem("Clean Code", "Robert C. Martin", "Programming", "978-0132350884", "2008-08-01");
            boolean checkoutSuccess1 = member1.checkoutBookItem(bookItem1);
            System.out.println("Checkout success for member1: " + checkoutSuccess1);

            // Member 2 reserves a book item
            BookReservation reservation1 = new BookReservation(ReservationStatus.PENDING, member2.getMemberId(), new Date(), bookItem1.getBarCode());
            BookReservation.reservations.put(bookItem1.getBarCode(), reservation1);
            System.out.println("Reservation created for member2: " + reservation1);

            // Member 1 returns the book item
            member1.returnBookItem(bookItem1);
            System.out.println("Book returned by member1.");

            // Update reservation status and send notification
            reservation1.updateStatus(ReservationStatus.APPROVED);
            reservation1.sendBookAvailabilityNotification();
            System.out.println("Reservation status updated and notification sent.");

            // Member 2 checks out the reserved book item
            boolean checkoutSuccess2 = member2.checkoutBookItem(bookItem1);
            System.out.println("Checkout success for member2: " + checkoutSuccess2);

            // Member 2 renews the book item
            renewSuccess = member2.renewBookItem(bookItem1);
            System.out.println("Renew success for member2: " + renewSuccess);

            // List all members
            System.out.println("Listing all members:");
            System.out.println(Member.getAllMembers());

            // Print final states
            System.out.println("Final Catalog State: " + Catalog.getBooks());
            System.out.println("Final Book Reservations: " + BookReservation.reservations);
            System.out.println("Final Book Lendings: " + BookLending.bookLendingMap);
            System.out.println("Final Fines: " + Fine.getFines());
            System.out.println("Library Management System operations completed successfully!");

    }
}