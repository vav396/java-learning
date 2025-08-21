package fundamentalsJava;

public class BankAccount {
    private String owner;
    private double balance;

    public double BankAccount(String owner, double balance) {
        this.owner = owner;
        if (balance <=  0) {
            return 0.00;
        }
        return this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
