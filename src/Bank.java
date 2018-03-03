/**
 * Created by fidel on 3/2/2018.
 */
public abstract class Bank {
    ProtocolBehavior protocolBehavior;
    FormatBehavior formatBehavior;
    public String name;

    public void setProtocol(ProtocolBehavior protocolBehavior){
        this.protocolBehavior = protocolBehavior;
        protocolBehavior.protocolType();
    }

    public void setFormat(FormatBehavior formatBehavior){
        this.formatBehavior = formatBehavior;
        formatBehavior.formatType();
    }

    public void transaction(Bank destination, double amount){
        System.out.println("Destination Bank: " + destination.name);
        System.out.println("Deposit amount: " + amount);
    }

}
