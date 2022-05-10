public class BankAccount {
    private String name;
    private int balance;
    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public int deposit(int x) {
        return (balance += x);
    };
    public int withdraw(int x) {
        return (balance -= x);
    };
    public String accBalance() {
        return (name + " account balance is: " + balance);
    };

};