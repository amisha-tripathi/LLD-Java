package LowLevelDesignPractice.ATM;

public class IdleState extends ATMState{
  @Override
  public void insertCard(ATM atm, Card card){
    System.out.println("card is inserted");
    atm.setCurrentATMState(new HasCardState());
  }
}
