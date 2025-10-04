public class OnlineStorePayment extends Payment{
    public OnlineStorePayment(PaymentProcessor  processor) {
        super(processor);
    }
    @Override
    public void pay(double amount) {
        System.out.println("Online store payment: ");
        processor.process(amount);
    }
}