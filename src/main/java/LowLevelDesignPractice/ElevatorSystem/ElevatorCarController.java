package LowLevelDesignPractice.ElevatorSystem;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorCarController {

  private ElevatorCar elevatorCar;
  //main logic will come here
  private PriorityQueue<Integer> upRequests; //min heap while moving up
  private PriorityQueue<Integer> downRequests; //max heap while moving down
  private Queue<Integer> idleRequests;

  public ElevatorCarController(ElevatorCar elevatorCar) {
    this.elevatorCar = elevatorCar;
    this.upRequests=new PriorityQueue<>();
    this.downRequests = new PriorityQueue<>(Collections.reverseOrder());
    this.idleRequests = new LinkedList<>();
  }

  public void addRequest(int floor){
    
  }

  public void processRequest(){

  }

  public void moveElevator(){

  }
}
