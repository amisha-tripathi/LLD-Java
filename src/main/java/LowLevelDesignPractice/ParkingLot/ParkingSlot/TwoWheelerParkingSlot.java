package LowLevelDesignPractice.ParkingLot.ParkingSlot;

public class TwoWheelerParkingSlot extends ParkingSlot{

  public TwoWheelerParkingSlot(int id) {
    super(id);
    this.price=20;
  }

  @Override
  public double computePrice(int entryTime) {
    int currentTime=100;
    return price*(currentTime-entryTime);
  }
}
