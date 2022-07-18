package solid.open_closed;

public class PaypalPayment implements EPayments{
    @Override
    public void processPayments() {
        System.out.println("Paiement par Paypal en cours");
    }
}
