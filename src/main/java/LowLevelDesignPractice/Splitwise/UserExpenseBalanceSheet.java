package LowLevelDesignPractice.Splitwise;

import java.util.Map;

public class UserExpenseBalanceSheet {
  Map<String, Balance> userVsBalance;

  public UserExpenseBalanceSheet(Map<String, Balance> userVsBalance, double toatlYourExoense, double totalYouoWE, double totalYouGetBack, double totalpayment) {
    this.userVsBalance = userVsBalance;
    ToatlYourExoense = toatlYourExoense;
    TotalYouoWE = totalYouoWE;
    this.totalYouGetBack = totalYouGetBack;
    Totalpayment = totalpayment;
  }

  double ToatlYourExoense;
  double TotalYouoWE;
  double totalYouGetBack;
  double Totalpayment;
}
