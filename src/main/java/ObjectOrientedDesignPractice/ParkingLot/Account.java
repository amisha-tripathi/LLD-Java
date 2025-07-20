package ObjectOrientedDesignPractice.ParkingLot;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Account {
  private Person person;
  private String accountId;
  private String username;
  private String password;

}