public class SavingsAccount extends BankAccount {

    @Override
    protected double getMinimumBalance() {
        return 50.0;
    }
}
