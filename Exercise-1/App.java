import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        ArrayList<Payable> paymentQueue = new ArrayList<Payable>();
        CreditCard card1 = new CreditCard("Bryan", 1000.0, 500.0);
        MealPlan plan1 = new MealPlan("Millie", 750.0);

        paymentQueue.add(card1);
        paymentQueue.add(plan1);
        for(int i = 0; i < paymentQueue.size(); i++){
            paymentQueue.get(i).processPayment(50.0);
        }
        System.out.println("Total Transactions: " + PaymentMethod.totalTransactions);
    }
    
}
