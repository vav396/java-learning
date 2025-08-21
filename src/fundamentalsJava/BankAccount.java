package fundamentalsJava;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Ноль положить нельзя");
        } else {
            this.balance += amount;
        }
    }

    void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Ноль снять нельзя");
        } else if (amount >balance) {
            System.out.println("Недостаточно средств");
        } else {
            this.balance -= amount;
        }
    }

    void displayInfo(){
        System.out.println("Владелец: " + owner + " Баланс: " + balance + " руб.");
    }
}
