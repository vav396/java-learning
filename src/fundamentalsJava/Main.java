package fundamentalsJava;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog("Bruno", 3);
//        dog.bark();
//        dog.info();
//
//        BankAccount account = new BankAccount("Алекс ",100.0);
//        BankAccount account1 = new BankAccount("Макс ",200.0);
//
//        account.deposit(100);
//        account.withdraw(150);
//        account.displayInfo();
//        account1.deposit(100);
//        account1.withdraw(150);
//        account1.displayInfo();

        Person person = new Person("Алекс");
        Person.printCount();
        Person person1 = new Person("Алекс");
        Person.printCount();
        Person person2 = new Person("Алекс");
        Person.printCount();
    }
}
