
public class CreditCard extends PaymentMethod {
    private double creditLimit;

    public CreditCard(String name, double balance, double limit){
        super(name, balance);
        creditLimit = limit;
    }

    @Override
    public void processPayment(double amount) {
        if(amount > (balance + creditLimit)){
            System.out.println("Credit Card: Transaction Declined.");
        } else {
            balance -= amount;
            creditLimit -= amount;
            totalTransactions++;
        }
    }

    @Override
    public String getPaymentStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPaymentStatus'");
    }

    @Override
    public void validateAccount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateAccount'");
    }
    
}
