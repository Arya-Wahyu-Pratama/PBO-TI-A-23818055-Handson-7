package enkapsulasi;

public class main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(100);

        //beli minuman
        bank.withdraw(20);
        System.out.println("Current balance is: " + bank.getBalance());
    }
}
