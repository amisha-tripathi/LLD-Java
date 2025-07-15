package LowLevelDesignPractice.Splitwise;

import java.util.List;

import LowLevelDesignPractice.Splitwise.Expense.Expense;
import LowLevelDesignPractice.Splitwise.Expense.ExpenseController;
import LowLevelDesignPractice.Splitwise.User.User;

public class Group {
  String id;
  String name;
  List<User> list;

  List<Expense> expenseList;
  ExpenseController exp;
}
