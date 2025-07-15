package LowLevelDesignPractice.ATM;

public class Card {
  UserBankAccount userBankAccount;
  static int PIN_NUMBER=1111;
  public boolean isCorrectPINEntered(int pin) {
    if(pin==PIN_NUMBER) return true;
    return false;
  }

  public void deductBankBalance() {
  }

  public int getBalance() {
    return userBankAccount.getBalance();
  }
}
