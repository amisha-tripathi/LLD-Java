package LowLevelDesignPractice.ATM;

public class CheckBalanceState extends ATMState{

  CheckBalanceState() {
  }

  @Override
  public void displayBalance(ATM atm, Card card){
    System.out.println("throwing an exception");
  }


  public void exit(ATM atm){
    returnCard();
    atm.setCurrentATMState(new IdleState());
  }
  public void returnCard(){
    System.out.println("Please collect your card");
  }
}

