package LowLevelDesignPractice.Splitwise.User;

import LowLevelDesignPractice.Splitwise.UserExpenseBalanceSheet;

public class User {
  String name;
  String id;

  public User(String name, String id, UserExpenseBalanceSheet userExpenseBalanceSheet) {
    this.name = name;
    this.id = id;
    this.userExpenseBalanceSheet = userExpenseBalanceSheet;
  }

  public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
    return userExpenseBalanceSheet;
  }

  UserExpenseBalanceSheet userExpenseBalanceSheet;
}
