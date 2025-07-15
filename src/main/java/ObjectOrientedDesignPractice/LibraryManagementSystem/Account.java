package ObjectOrientedDesignPractice.LibraryManagementSystem;

public abstract class Account {
    public String getAccountId() {
        return accountId;
    }

    public Person getPerson() {
        return person;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public String getPassword() {
        return password;
    }

    private String accountId;
    private Person person;
    private AccountStatus status;
    private String password;

    Account(String accountId, Person person, String password) {
        this.accountId = accountId;
        this.person = person;
        this.status = AccountStatus.ACTIVE; // Default status for first time account creation
        this.password = password;
    }
}