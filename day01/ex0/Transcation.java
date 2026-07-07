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
        SetIdentifier(UUID.randomUUID().toString());
        SetRecipient(_Recipient);
        SetSender(_Sender);
        Setcategory(_category);
        SetTranscation_amount(_Transfer_amount);
    }

    public User GetRecipient() {
        return Recipient;
    }
    public void SetRecipient(User R) {
        Recipient = R;
    }




    public User GetSender() {
        return Sender;
    }
    public void SetSender(User S) {
        Sender = S;
    }





    public double GetTranscation_amount() {
        return Transfer_amount;
    }
    public void SetTranscation_amount(double amount) {
        if (category == Category.debits && amount > 0) {
            System.err.println("Debit transaction amount must be negative.");
            System.exit(-1);
        }
        if (category == Category.credits && amount < 0) {
            System.err.println("Credit transaction amount must be positive.");
            System.exit(-1);
        }
        Transfer_amount = amount;
    }




    public Category Getcategory() {
        return category;
    }
    public void Setcategory(Category _Category) {
        category = _Category;
    }




    public String GetIdentifier() {
        return Identifier;
    }
    public void SetIdentifier(String Id) {
        Identifier = Id;
    }
}