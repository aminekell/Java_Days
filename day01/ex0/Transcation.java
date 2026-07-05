import java.util.UUID;

/**
 * Transcation
 */
public class Transcation {

    public  enum Category {
        debits
        ,credits
    }
    private String Identifier;
    private User Recipient;
    private User Sender;
    private double Transfer_amount;
    private Category category;


    Transcation(User _Recipient , User _Sender ,Category  _category , double _Transfer_amount)
    {
        Identifier = UUID.randomUUID().toString();
        Recipient = _Recipient;
        Sender = _Sender;
        Transfer_amount = _Transfer_amount;
        category = _category;
    }


    public User GetRecipient()
    {
        return  Recipient;
    }

    public User GetSender()
    {
        return  Sender;
    }

    public double GetTranscation_amount()
    {
        return  Transfer_amount;
    }
    
    public Category Getcategory()
    {
        return  category;
    }

    public String Identifier()
    {
        return  Identifier;
    }
    public void Setcategory(Category _Category)
    {
        category = _Category;
    }
    public void set_amount(double amount)
    {
        if(category == category.debits &&  amount > 0)
            {
                System.exit(-1);
            }
        if(category == category.credits && amount < 0)
            {
                System.exit(-1);
            }
    }
}