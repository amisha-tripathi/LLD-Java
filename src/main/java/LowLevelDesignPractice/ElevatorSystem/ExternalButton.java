package LowLevelDesignPractice.ElevatorSystem;

public class ExternalButton {
  public ExternalButton(ExternalButtonDispatcher externalButtonDispatcher) {
    this.externalButtonDispatcher = externalButtonDispatcher;
  }

  ExternalButtonDispatcher externalButtonDispatcher;

  public void press(int floor, Direction direction) {
    externalButtonDispatcher.submitRequest(floor, direction);
  }

}
