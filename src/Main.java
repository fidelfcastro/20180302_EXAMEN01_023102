/**
 * Created by fidel on 3/2/2018.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("EXAMEN PARCIAL 01");

        BankA bankA = new BankA();
        System.out.println(bankA.name);
        bankA.setProtocol(new Http());
        bankA.setFormat(new Json());
        bankA.transaction(new BankB(), 250.00);

        System.out.println("");
        BankB bankB = new BankB();
        System.out.println(bankB.name);
        bankA.setProtocol(new FTP());
        bankA.setFormat(new Xml());
        bankA.transaction(new BankC(), 375.80);
        
        System.out.println("");
        BankC bankC = new BankC();
        System.out.println(bankC.name);
        bankA.setProtocol(new NTP());
        bankA.setFormat(new Yaml());
        bankA.transaction(new BankA(), 459.00);
    }
}
