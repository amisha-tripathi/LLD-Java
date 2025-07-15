package LowLevelDesignPractice.ATM;

import static LowLevelDesignPractice.VendingMachine.TransactionType.balanceCheck;
import static LowLevelDesignPractice.VendingMachine.TransactionType.cashWithdraw;

import LowLevelDesignPractice.VendingMachine.TransactionType;

public class SelectOperationState extends ATMState{
  public SelectOperationState(){
    System.out.println("select the operation");
  }
  @Override
  public void selectOperation(ATM atm, Card card, TransactionType tx){
    if(tx.equals(cashWithdraw)){
      atm.setCurrentATMState(new CashWithdrawProcessorState());
    }else if(tx.equals(balanceCheck)){
      atm.setCurrentATMState(new CheckBalanceState());
    }else{
      exit(atm);
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
