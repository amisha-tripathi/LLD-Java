package LowLevelDesignPractice.ATM;

public class User {
  Card card;
  UserBankAccount bk;

  public void setCard(UserBankAccount b) {
    bk=b;
  }
}
