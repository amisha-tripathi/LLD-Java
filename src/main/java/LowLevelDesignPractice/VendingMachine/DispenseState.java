package LowLevelDesignPractice.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class DispenseState implements State{
  @Override
  public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {

  }

  @Override
  public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {

  }

  @Override
  public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {

  }

  @Override
  public void clickOnCancelButton(VendingMachine machine) throws Exception {

  }

  @Override
  public int getChange(int returnChangeMoney) throws Exception {
    return 0;
  }

  @Override
  public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
    //implement this, item from machine and remove it.a and set back to idle state.
    return null;
  }

  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    List<Coin> l=new ArrayList<Coin>();
    return l;
  }

  @Override
  public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

  }
}
