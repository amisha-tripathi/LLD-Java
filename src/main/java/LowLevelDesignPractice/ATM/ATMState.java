package LowLevelDesignPractice.ATM;

import LowLevelDesignPractice.VendingMachine.TransactionType;

public abstract class ATMState {

  public void insertCard(ATM atm, Card card){
    System.out.println("throwing an exception");
  }

  public void authetincatePIN(ATM atm, Card card, int pin){
    System.out.println("throwing an exception");
  }

  public void selectOperation(ATM atm, Card card, TransactionType tx){
    System.out.println("throwing an exception");
  }

  public void cashWithdraw(ATM atm, Card card, int withdraamount){
    System.out.println("throwing an exception");
  }

  public void displayBalance(ATM atm, Card card){
    System.out.println("throwing an exception");
  }

  public void returnCard(){

  }

  public void exit(ATM atm){

  }



}
