/**
 * Created by fidel on 3/2/2018.
 */
public abstract class Bank {
    ProtocolBehavior protocolBehavior;
    FormatBehavior formatBehavior;
    public String name;

    public void setProtocol(ProtocolBehavior protocolBehavior){
        this.protocolBehavior = protocolBehavior;
    }

    public void setFormat(FormatBehavior formatBehavior){
        this.formatBehavior = formatBehavior;
    }


    public abstract void transfer(Bank destination, double amount);


}
