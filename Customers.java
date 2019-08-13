package ATM;

public class Customers {

    String name, pin;
    double balance;

    public Customers(String name, String pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public double GetBalance() {
        return this.balance;
    }

    public void Deposit(double extra) {
        this.balance += extra;
    }

    public void Withdraw(double extra) {
        this.balance -= extra;
    }
}
