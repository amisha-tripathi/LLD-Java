package LowLevelDesignPractice.ATM.ProcessorChainOfResponsibility;

import LowLevelDesignPractice.ATM.ATM;

public class CashWithdrawProcessor {
  CashWithdrawProcessor nextProcessor;
  CashWithdrawProcessor(CashWithdrawProcessor nxt){
    this.nextProcessor=nxt;
  }

  public void withdraw(ATM atm, int leftAmount){
    if(this.nextProcessor!=null){
      this.nextProcessor.withdraw(atm, leftAmount);
    }
  }
}
