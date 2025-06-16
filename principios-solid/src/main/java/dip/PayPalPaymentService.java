public class PayPalPaymentService implements PaymentService {
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
