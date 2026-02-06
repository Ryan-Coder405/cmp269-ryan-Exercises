
public abstract class PaymentMethod implements Payable {
    protected String accountHolder;
    protected double balance;
    public static int totalTransactions = 0;

    public PaymentMethod (String name, double balance){
        this.accountHolder = name;
        this.balance = balance;
    }

    public abstract void validateAccount();



}
