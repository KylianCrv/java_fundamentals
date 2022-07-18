package solid.open_closed;

//1ere etape
//Avoir une méthode appelée ProcessPayment
//Si le mode de paiement est visa, afficher "paiement par carte visa en cours"
//Si le mode de paiement est mastercard, afficher "paiement par carte mastercard en cours"
//Si le mode de paiement est paypal, afficher "paiement par paypal en cours"

//2ème étape
//Faire ressortir les problèmes avec cette implémentation

//3eme étape
//Proposer une meilleure solution en réduisant le couplage
public class PaymentService {
    private EPayments paymentMethod;

    public PaymentService(EPayments paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(){
        paymentMethod.processPayments();
    }
}
