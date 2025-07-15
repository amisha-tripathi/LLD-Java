package LowLevelDesignPractice.ATM;

public class HasCardState extends ATMState{
  public HasCardState(){
    System.out.println("your card has been inserted");
  }

  @Override
  public void authetincatePIN(ATM atm, Card card, int pin){
    boolean isPinCorrect= card.isCorrectPINEntered(pin);
    if(isPinCorrect){
      atm.setCurrentATMState(new SelectOperationState());
    }else{
      System.out.println("throwing an exception as wrong PIN");
    }
  }
  public void exit(ATM atm){
    returnCard();
    atm.setCurrentATMState(new IdleState());
  }
  public void returnCard(){
  System.out.println("Please collect your card");
  }
}
