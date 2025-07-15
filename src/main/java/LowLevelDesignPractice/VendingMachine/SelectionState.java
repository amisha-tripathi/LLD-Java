package LowLevelDesignPractice.VendingMachine;
import java.util.ArrayList;
import java.util.List;

public class SelectionState implements State{
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
//choose product logic goes here, if item bought by user cost > coins sum put by user refund and throw exception
    //or give the change, and setThe next state to DispenseState
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
    return null;
  }

  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    machine.setVendingMachineState(new IdleState());
    return machine.getCoinList();
  }

  @Override
  public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

  }
}
