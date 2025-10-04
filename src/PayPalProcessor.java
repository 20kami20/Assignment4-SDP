public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
