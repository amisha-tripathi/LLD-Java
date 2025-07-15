package ObjectOrientedDesignPractice.LibraryManagementSystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
private static String name;
private static String email;
private static String phoneNumber;
Address address;
}