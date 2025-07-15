package ObjectOrientedDesignPractice.LibraryManagementSystem;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookReservation {
  private ReservationStatus status;
  private String memberId;

  private Date reservationDate;

  private String bookItemBarCode;

  static Map<String, BookReservation> reservations = new HashMap<>();

  static BookReservation fetchReservation(String bookItemBarCode) {
    return reservations.get(bookItemBarCode);
  }
  void updateStatus(ReservationStatus status){
    this.status= status;
  }
  public void sendBookAvailabilityNotification() {
    // Logic to send notification to the member about book availability
    System.out.println("Notification sent to member " + memberId + " about book availability for " + bookItemBarCode);
  }

}