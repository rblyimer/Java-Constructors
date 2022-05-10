public class BankTransfer {
    public static void main(String[] args) {
        BankAccount Checking = new BankAccount("Robel's checking", 500);
        Checking.deposit(100);
        System.out.println(Checking.accBalance());

        BankAccount Savings = new BankAccount("Robel's Savings", 5000);
        BankAccount Travel = new BankAccount("Robel's Travel", 300);
        Savings.withdraw(100);
        Travel.deposit(100);
        System.out.println(Savings.accBalance());
        System.out.println(Travel.accBalance());
    }
}