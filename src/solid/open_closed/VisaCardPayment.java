package solid.open_closed;

public class VisaCardPayment implements EPayments{
    @Override
    public void processPayments() {
        System.out.println("Paiement par carte visa en cours");
    }
}
