package LowLevelDesignPractice.ParkingLot.ParkingSlot;

public class ThreeWheelerParkingSlot extends ParkingSlot{
  public ThreeWheelerParkingSlot(int id) {
    super(id);
    this.price=50;
  }

  @Override
  public double computePrice(int entryTime) {
    int currentTime=100;
    return price*(currentTime-entryTime);
  }
}
