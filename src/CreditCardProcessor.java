public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
