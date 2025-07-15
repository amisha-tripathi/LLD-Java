package LowLevelDesignPractice.Splitwise.Expense;

import java.util.List;

import LowLevelDesignPractice.Splitwise.BalanceSheetController;
import LowLevelDesignPractice.Splitwise.Expense.Split.ExpenseSplitType;
import LowLevelDesignPractice.Splitwise.Expense.Split.Split;
import LowLevelDesignPractice.Splitwise.User.User;

public class ExpenseController {
  BalanceSheetController balanceSheetController;
  public ExpenseController(String expenseId, String description, double expenseAmount, User paidByuser, ExpenseSplitType splitType, List<Split> splitDetails) {

    balanceSheetController.updateUserExpenseBalanceSheet(paidByuser, splitDetails, expenseAmount);
  }
}
