/**
 * Created by fidel on 3/2/2018.
 */
public class BankA extends Bank {
    Bank destination;
    double amount;

    public BankA() {
        this.name = "Bank A";
    }

    @Override
    public void transfer(Bank destination, double amount) {
        this.destination = destination;
        this.amount = amount;
    }
}
