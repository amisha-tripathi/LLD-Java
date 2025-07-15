package LowLevelDesignPractice.Splitwise.Expense.Split;

import LowLevelDesignPractice.Splitwise.User.User;

public class Split {
  User user;
  double amountOwe;

  public Split(User user, double amountOwe) {
    this.user = user;
    this.amountOwe = amountOwe;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public double getAmountOwe() {
    return amountOwe;
  }

  public void setAmountOwe(double amountOwe) {
    this.amountOwe = amountOwe;
  }

}
