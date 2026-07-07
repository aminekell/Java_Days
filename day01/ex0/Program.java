public class Program {
    public static void main(String[] args) {

        User amine = new User(1, "Amine", 10000);
        User kella = new User(2, "Kella", 22000);

        Transcation t1 = new Transcation(amine, kella, Transcation.Category.debits, -500);
        Transcation t2 = new Transcation(kella, amine, Transcation.Category.credits, 500);

        System.out.println("-----------------------------");
        System.out.println("User name: " + amine.GetName() + ", the id is: " + amine.Getid() + ", the balance is: "
                + amine.GetBalance());
        System.out.println("-----------------------------");
        System.out.println("User name: " + kella.GetName() + ", the id is: " + kella.Getid() + ", the balance is: "
                + kella.GetBalance());
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        System.out.println("Transaction ID: " + t1.Identifier());
        System.out.println("Sender: " + t1.GetSender().GetName());
        System.out.println("Recipient: " + t1.GetRecipient().GetName());
        System.out.println("Amount: " + t1.GetTranscation_amount());
        System.out.println("Category: " + t1.Getcategory());
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        System.out.println("Transaction ID: " + t2.Identifier());
        System.out.println("Sender: " + t2.GetSender().GetName());
        System.out.println("Recipient: " + t2.GetRecipient().GetName());
        System.out.println("Amount: " + t2.GetTranscation_amount());
        System.out.println("Category: " + t2.Getcategory());
        System.out.println("-----------------------------");
    }
}