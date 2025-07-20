package ObjectOrientedDesignPractice.ParkingLot;

public abstract class ParkingSpot {
  private Vehicle vehicle;
  private final ParkingSpotType parkingSpotType;

  private String number;

  private boolean free = true;

  public ParkingSpot(ParkingSpotType parkingSpotType) {
    this.parkingSpotType = parkingSpotType;
  }

  public boolean isFree() {
    return free;
  }

  public boolean assignVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    this.free = false;
    return true;
  }

  public boolean removeVehicle() {
    this.vehicle = null;
    this.free = true;
    return true;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public ParkingSpotType getParkingSpotType() {
    return parkingSpotType;
  }
}

class HandicappedSpot extends ParkingSpot {
  public HandicappedSpot() {
    super(ParkingSpotType.HANDICAPPED);
  }
}

class CompactSpot extends ParkingSpot {

  public CompactSpot(ParkingSpotType parkingSpotType) {
    super(parkingSpotType);
  }
}

class LargeSpot extends ParkingSpot {
    public LargeSpot() {
        super(ParkingSpotType.LARGE);
    }
}

class MotorBikeSpot extends ParkingSpot {

  public MotorBikeSpot(ParkingSpotType parkingSpotType) {
    super(parkingSpotType);
  }
}

class ElectricSpot extends ParkingSpot {
  public ElectricSpot() {
    super(ParkingSpotType.ELECTRIC);
  }
}