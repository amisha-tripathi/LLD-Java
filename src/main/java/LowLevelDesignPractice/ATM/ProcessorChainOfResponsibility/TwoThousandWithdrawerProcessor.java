package LowLevelDesignPractice.ATM.ProcessorChainOfResponsibility;

import LowLevelDesignPractice.ATM.ATM;

public class TwoThousandWithdrawerProcessor extends CashWithdrawProcessor{
  TwoThousandWithdrawerProcessor(CashWithdrawProcessor next){
  super(next);
  }

  public void withdraw(ATM atm, int leftAmount){
    int requiredAmount=leftAmount/2000;
    int remainingAmount= leftAmount%2000;
    if(requiredAmount<=atm.getNoofTwoThousandNotes()){
      atm.deductATMBalance(requiredAmount);
    }else if(requiredAmount>atm.getNoofTwoThousandNotes()){
      atm.deductATMBalance(atm.getNoofTwoThousandNotes());
      remainingAmount+=requiredAmount-(atm.getNoofTwoThousandNotes()*2000);
    }

    if(remainingAmount != 0){
      super.nextProcessor.withdraw(atm, remainingAmount);
    }
  }
}
