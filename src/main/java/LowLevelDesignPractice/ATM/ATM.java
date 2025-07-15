package LowLevelDesignPractice.ATM;

public class ATM {

  private static ATM atmObj=new ATM();

  ATMState atmStateObj;
  private int amtBalance;
  private int noofTwoThousandNotes;

  public int getNoofOneHundredNotes() {
    return noofOneHundredNotes;
  }

  private int noofOneHundredNotes;

  private int noofFiveHundredNotes;

  public int getAmtBalance() {
    return amtBalance;
  }

  public void setAmtBalance(int amtBalance, int n1, int n2, int n3) {
    this.amtBalance = amtBalance;
    this.noofTwoThousandNotes=n1;
    this.noofOneHundredNotes=n2;
    this.noofFiveHundredNotes=n3;
  }

  private ATM(){
    atmObj.setCurrentATMState(new IdleState());

  }

  public ATM getATMObject(){
    atmObj.setCurrentATMState(new IdleState());
    return atmObj;
  }
  public void setCurrentATMState(ATMState state) {
    atmStateObj=state;
  }

  public ATMState getCurrentATMState() {

    return atmStateObj;
  }

  public int getBalance() {
    return amtBalance;
  }

  public int getNoofTwoThousandNotes() {
    return noofTwoThousandNotes;
  }

  public void setNoofTwoThousandNotes(int noofTwoThousandNotes) {
    this.noofTwoThousandNotes = noofTwoThousandNotes;
  }


  public void setNoofOneHundredNotes(int noofOneHundredNotes) {
    this.noofOneHundredNotes = noofOneHundredNotes;
  }

  public int getNoofFiveHundredNotes() {
    return noofFiveHundredNotes;
  }

  public void setNoofFiveHundredNotes(int noofFiveHundredNotes) {
    this.noofFiveHundredNotes = noofFiveHundredNotes;
  }


  public void deductATMBalance(int n) {

  }
}
