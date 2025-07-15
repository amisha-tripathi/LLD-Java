package LowLevelDesignPractice.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

  public IdleState(){
  }
  public IdleState(VendingMachine vm){
    ArrayList<Integer> l=new ArrayList<>();
    vm.setCoinList(l);
  }
  @Override
  public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
    machine.setVendingMachineState(new HasMoneyState());
  }

  @Override
  public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
    machine.getInventory().addItem(item, codeNumber);
  }


    @Override
  public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
  throw new Exception();
  }

  @Override
  public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
    throw new Exception();
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
    return null;
  }

}
