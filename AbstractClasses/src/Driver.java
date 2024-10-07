public class Driver {
    public static void main(String[] args) {
        try {
            BankAccount sAccount = new SavingsAccount();
            BankAccount cAccount = new CheckingAccount();
            emptyAccount(cAccount);
        } catch (BankAccount.WithdrawalException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayBankAccount(BankAccount bankAccount) {
        bankAccount.withdraw(1000);
        System.out.println(bankAccount.getBalance());
    }
    public static void emptyAccount(BankAccount bankAccount) {
        bankAccount.withdraw(999999);
    }
}
