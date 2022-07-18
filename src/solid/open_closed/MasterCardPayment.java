package solid.open_closed;

public class MasterCardPayment implements EPayments{
    @Override
    public void processPayments() {
        System.out.println("Paiement par Mastercard en cours");
    }
}
