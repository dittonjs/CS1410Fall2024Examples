public class SavingsAccount extends BankAccount implements Serializable {

    @Override
    protected double getMinimumBalance() {
        return 50.0;
    }

    @Override
    public String serialize() {
        return "Balance: " + getBalance();
    }
}
