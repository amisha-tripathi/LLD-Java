package LowLevelDesignPractice.ATM;

public class CashWithdrawProcessorState extends ATMState{

  public CashWithdrawProcessorState() {
    System.out.println("withdraw cash");
  }

  @Override
  public void cashWithdraw(ATM atm, Card card, int withdraamount){
    if(atm.getBalance() < withdraamount) {
      System.out.println("Please collect your card");
      exit(atm);
    }else if(card.getBalance()<withdraamount){
      System.out.println("Please collect your card");
      exit(atm);}
    else {
      card.deductBankBalance();
//      atm.deductATMBalance();

//      CashWithdrawProcessor withdrawer= new TwoThousandProcessor(new FiveHundredProcessor(new OneHundredWithdrawprocessor()));
     // withdrawer.withdraw(atm, withdraamount);
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