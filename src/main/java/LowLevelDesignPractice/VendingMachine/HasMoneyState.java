package LowLevelDesignPractice.VendingMachine;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class HasMoneyState implements State{
  HasMoneyState(){
  System.out.println("currently machine is in moneyState");
  }



  @Override
  public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {

  }

  @Override
  public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
    machine.getCoinList().add(coin);
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
    machine.setVendingMachineState(new SelectionState());
  }

  @Override
  public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
 throw new Exception();
  }

  @Override
  public void clickOnCancelButton(VendingMachine machine) throws Exception {
    throw new Exception();
  }

  @Override
  public int getChange(int returnChangeMoney) throws Exception {
    return 0;
  }

  @Override
  public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
    return null;
  }

  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    machine.setVendingMachineState(new IdleState());
    return machine.getCoinList();
  }

  @Override
  public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
    throw new Exception();
  }
}
