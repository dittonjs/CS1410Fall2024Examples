public class CheckingAccount extends BankAccount{
    @Override
    protected double getMinimumBalance() {
        return 0.0;
    }
}
