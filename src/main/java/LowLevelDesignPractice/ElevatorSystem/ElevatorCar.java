package LowLevelDesignPractice.ElevatorSystem;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElevatorCar {

  private Direction currentdirection;
  private Status status;
  private int currentFloor;
  private InternalButton internalButton;
  private int id;

//  public ElevatorCar(int id) {
//    this.currentdirection = Direction.IDLE;
//    this.status = Status.IDLE;
//    this.currentFloor = 0;
//    this.internalButton = new InternalButton(new InternalButtonDispatcher());
//    this.id = id;
//  }

  public void move(int floor, Direction direction){
    this.currentdirection = direction;
    this.status = Status.MOVING;
    this.currentFloor = floor;
    internalButton.pressButton(floor,id);
    //wait for an avg 30sec.
    stop();
  }

  public void stop(){
    this.currentdirection = Direction.IDLE;
    this.status = Status.IDLE;
  }

  public Direction getCurrentdirection() {
    return currentdirection;
  }

  public Status getStatus() {
    return status;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }




}
