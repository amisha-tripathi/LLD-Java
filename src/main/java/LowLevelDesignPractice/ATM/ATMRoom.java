package LowLevelDesignPractice.ATM;

public class ATMRoom {
  ATM atm;
  User user;

  ATMRoom(){
    initialise();
  }
  public void initialise(){
    atm=atm.getATMObject();
    atm.setAmtBalance(7000, 1, 8, 9);
    this.user=new User();
    UserBankAccount usbk=new UserBankAccount();
    usbk.setBalance(1000);
    user.setCard(usbk);
  }

}
