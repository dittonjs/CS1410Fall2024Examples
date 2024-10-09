import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        try {
            SavingsAccount sAccount = new SavingsAccount();
            BankAccount cAccount = new CheckingAccount();
//            emptyAccount(cAccount);
            Person person = new Person(new CheckingAccount());
            displayBalance(person);
            displayBalance(sAccount);
            displayBalance(cAccount);

            ArrayList<Integer> a = new ArrayList<>();
            serializeObject(person);
            serializeObject(sAccount);
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

    public static void displayBalance(Balanceable balanceable) {
        System.out.println(balanceable.getBalance());
    }

    public static void serializeObject(Serializable serializable) {
        System.out.println(serializable.serialize());
    }
}
