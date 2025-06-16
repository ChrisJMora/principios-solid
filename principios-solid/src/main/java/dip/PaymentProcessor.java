public class PaymentProcessor {
    private final PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment(String order, double amount) {
        System.out.println("Processing order: " + order);
        paymentService.pay(amount);
    }
}
