public class MealPlan extends PaymentMethod{

    public MealPlan(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void processPayment(double amount) {
        validateAccount();
        if(balance < 0 ){

        } else if(amount < balance){
            balance -= amount;
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
        //as the user is paying for meal plans, if they go negative then account is invalid.
        if(balance < 0){
            System.out.println("Invalid Account");
        } else {
            System.out.println("Valid Account for MealPlan");
        }
    }
    
}
