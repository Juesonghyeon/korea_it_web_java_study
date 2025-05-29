package _21_Class.BankAccount;

public class BankAccoutMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
        bankAccount.deposit(-44444444);
        bankAccount.withdraw(5000);
        bankAccount.withdraw(5001);
        bankAccount.withdraw(5000);
        bankAccount.deposit(10000);
        System.out.println(bankAccount.getBalance());


    }

}
