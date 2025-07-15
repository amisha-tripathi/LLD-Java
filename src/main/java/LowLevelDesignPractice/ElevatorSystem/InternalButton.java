package LowLevelDesignPractice.ElevatorSystem;

public class InternalButton {
  InternalButtonDispatcher internalButtonDispatcher;

  public InternalButton(InternalButtonDispatcher internalButtonDispatcher) {
    this.internalButtonDispatcher = internalButtonDispatcher;
  }

  void pressButton(int floor, int elevatorId){
    internalButtonDispatcher.submit(floor, elevatorId);
  }
}
