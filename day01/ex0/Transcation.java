
/**
 * Transcation
 */
public class Transcation {

    private Integer Identifier;
    private User Recipient;
    private User Sender;
    private double Transfer_amount;
    private Category category;


    private enum Category {
        debits
        ,credits
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

    public Integer Identifier()
    {
        return  Identifier;
    }
    public void Setcategory(Category _Category)
    {
        category = _Category;
    }
}