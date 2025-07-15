package LowLevelDesignPractice.Splitwise.Expense;

import java.util.ArrayList;
import java.util.List;

import LowLevelDesignPractice.Splitwise.Expense.Split.ExpenseSplitType;
import LowLevelDesignPractice.Splitwise.Expense.Split.Split;
import LowLevelDesignPractice.Splitwise.User.User;

public class Expense {
  String expenseId;
  String description;
  double ExpenseAmount;
  User user;
  ExpenseSplitType splitType;
  List<Split> splitDetails=new ArrayList<>();

  public Expense(String expenseId, String description, double expenseAmount, User user, ExpenseSplitType splitType, List<Split> splitDetails) {
    this.expenseId = expenseId;
    this.description = description;
    ExpenseAmount = expenseAmount;
    this.user = user;
    this.splitType = splitType;
    this.splitDetails = splitDetails;
  }
}
