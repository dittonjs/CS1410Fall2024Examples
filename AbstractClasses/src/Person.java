public class Person implements Balanceable, Serializable {
    private BankAccount bankAccount;
    public Person(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    @Override
    public String serialize() {
        return "Bank account balance: " + bankAccount.getBalance();
    }
}
