/**
 * Created by fidel on 3/2/2018.
 */
public class BankC extends Bank {
    Bank destination;
    double amount;

    public BankC() {
     this.name = "Bank C";
    }

    @Override
    public void transfer(Bank destination, double amount) {
        this.destination = destination;
        this.amount = amount;
    }
}
