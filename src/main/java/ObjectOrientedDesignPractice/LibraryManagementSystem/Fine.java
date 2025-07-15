package ObjectOrientedDesignPractice.LibraryManagementSystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fine {
    private String memberId;
    private String bookItemBarcode;
    private long dateIssued;
    static void collectFine(String memberId, String bookItemBarcode, long dateIssued) {
        Fine fine = new Fine(memberId, bookItemBarcode, dateIssued);
        // Logic to collect fine (e.g., save to database)
        System.out.println("Fine collected: " + fine);
    }

    public static String getFines() {
        // Logic to retrieve fines (e.g., from database)
        // For demonstration, returning a static message
        return "Fines retrieved successfully.";
    }
}