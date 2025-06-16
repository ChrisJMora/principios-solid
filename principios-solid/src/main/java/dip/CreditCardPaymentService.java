public class CreditCardPaymentService implements PaymentService {
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
