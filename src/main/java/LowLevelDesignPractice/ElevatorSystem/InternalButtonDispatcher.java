package LowLevelDesignPractice.ElevatorSystem;

import java.util.List;

public class InternalButtonDispatcher {
  List<ElevatorCarController> controllers;

  public void submit(int floor, int elevatorId) {
    controllers.get(elevatorId).addRequest(floor);
  }
}
