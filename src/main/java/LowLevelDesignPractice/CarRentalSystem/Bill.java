package LowLevelDesignPractice.CarRentalSystem;


public class Bill {
 Reservation reservation;

  public Bill(Reservation reservation) {
    //based on startTime for that vehicle reservation we can total cost is evaluated.
    this.reservation=reservation;
  }

  public double TotalCost(){
    return 100.0;
  }
}
