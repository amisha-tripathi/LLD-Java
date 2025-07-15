package ObjectOrientedDesignPractice.LibraryManagementSystem;

public class Librarian extends Account {
    private String employeeId;

    public Librarian(String accountId, Person person, String password, String employeeId) {
        super(accountId, person, password);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Additional methods specific to Librarian can be added here
    public void addBookToCatalog(Catalog catalog, Book book) {
        catalog.addBook(book);
    }

    public void removeBookFromCatalog(Catalog catalog, Book book) {
        catalog.removeBook(book);
    }
}