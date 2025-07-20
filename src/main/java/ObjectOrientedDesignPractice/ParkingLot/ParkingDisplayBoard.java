package ObjectOrientedDesignPractice.ParkingLot;

public class ParkingDisplayBoard {
  private String id;
  private HandicappedSpot handicappedSpot;
  private CompactSpot compactSpot;
  private LargeSpot largeSpot;
  private MotorBikeSpot motorbikeSpot;
  private ElectricSpot electricSpot;

  public void showEmptySpotNumber(){
    String message ="";
    System.out.println("Parking Display Board");
  }

}