public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new OnlineStorePayment(new CreditCardProcessor());
        creditCardPayment.pay(100);
        Payment paypalPayment = new OnlineStorePayment(new PayPalProcessor());
        paypalPayment.pay(50);
    }
}