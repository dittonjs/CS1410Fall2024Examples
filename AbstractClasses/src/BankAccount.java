public abstract class BankAccount implements Balanceable {
    private String accountNumber;
    private double balance = 2000;
    private String accountHolderName;

    public static class WithdrawalException extends RuntimeException {
        public WithdrawalException(String message) {
            super(message);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount > getMinimumBalance()) {
            balance -= amount;
        } else {
            throw new WithdrawalException("Minimum balance reached: " + getMinimumBalance() + "\n");
        }
    }

    protected abstract double getMinimumBalance();
}
