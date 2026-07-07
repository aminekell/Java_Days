public class User {
    private Integer id;
    private String Name;
    private double Balance;

    public User(int _id, String _Name, double _Balance) {
        if (Balance < 0) {
            System.err.print("Balnace most be possitive !!");
            System.exit(-1);
        }
        id = _id;
        Name = _Name;
        Balance = _Balance;
    }

    public Integer Getid() {
        return id;
    }

    public String GetName() {
        return Name;
    }

    public void SetName(String _Name) {
        Name = _Name;
    }

    public double GetBalance() {
        return Balance;
    }

    public void SetBalance(double _Balance) {
        if (_Balance < 0) {
            System.err.print("Balnace most be possitive !!");
            System.exit(-1);
        }
        Balance = _Balance;
    }
}

// The difference between int and Integer in Java is that int is a primitive
// data type. It stores the value directly in memory and does not provide any
// methods. Integer is an object (a wrapper class) that stores an int value and
// provides useful methods for working with integers.