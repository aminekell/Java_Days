import java.util.UUID;

public class Transcation {

    public enum Category {
        debits, credits
    }

    private String Identifier;
    private User Recipient;
    private User Sender;
    private double Transfer_amount;
    private Category category;

    public Transcation(User _Recipient, User _Sender, Category _category, double _Transfer_amount) {
        Identifier = UUID.randomUUID().toString();
        Recipient = _Recipient;
        Sender = _Sender;
        category = _category;
        Transfer_amount = set_amount(_Transfer_amount);
    }

    public User GetRecipient() {
        return Recipient;
    }

    public User GetSender() {
        return Sender;
    }

    public double GetTranscation_amount() {
        return Transfer_amount;
    }

    public Category Getcategory() {
        return category;
    }

    public double getAmount() {
        return Transfer_amount;
    }

    public String Identifier() {
        return Identifier;
    }

    public void Setcategory(Category _Category) {
        category = _Category;
    }

    private double set_amount(double amount) {
        if (category == Category.debits && amount > 0) {
            System.err.println("Debit transaction amount must be negative.");
            System.exit(-1);
            throw new IllegalArgumentException("Debit transaction amount must be negative.");
        }

        if (category == Category.credits && amount < 0) {
            System.err.println("Credit transaction amount must be positive.");
            System.exit(-1);
        }

        return amount;
    }
}