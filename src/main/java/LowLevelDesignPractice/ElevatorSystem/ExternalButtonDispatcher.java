package LowLevelDesignPractice.ElevatorSystem;

import java.util.List;

public class ExternalButtonDispatcher {
  List<ElevatorCarController> controllers;

  public void submitRequest(int floor, Direction direction) {
    System.out.println("Request received at floor: " + floor + " for direction: " + direction);
    ElevatorCarController bestElevator = findBestElevator(floor, direction);  // Find best elevator
    bestElevator.addRequest(floor);
  }

  private ElevatorCarController findBestElevator(int floor, Direction direction) {
    return controllers.get(0);
  }
}
