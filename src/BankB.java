/**
 * Created by fidel on 3/2/2018.
 */
public class BankB extends Bank {
    Bank destination;
    double amount;

    public BankB() {
        this.name = "Bank B";
    }

    @Override
    public void transfer(Bank destination, double amount) {
        this.destination = destination;
        this.amount = amount;
    }

}
