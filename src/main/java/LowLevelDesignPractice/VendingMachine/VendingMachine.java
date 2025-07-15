package LowLevelDesignPractice.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
  State Ob;
  Inventory obj;

  List<Coin> list;

  public List<Coin> getCoinList() {
    return list;
  }

  public void setVendingMachineState(State idleState) {
  }

  public void setCoinList(ArrayList<Integer> arrayList) {
  }

  public Inventory getInventory() {
    return obj;
  }
}
