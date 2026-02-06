
public abstract class PaymentMethod implements Payable {
    protected String accountHolder;
    protected double balance;
    public static int totalTransactions;

    public PaymentMethod (){
        accountHolder = "";
        balance = 0;
    }

    public abstract void validateAccount();



}
