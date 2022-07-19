package exos_solid.cas1;

public class Case1 {
    public static void main(String[] args) {

        var email = new Email();
        var emailNotif = new NotificationService(email);
        emailNotif.sendNotifOTP();
        emailNotif.sendTransactionReport();
    }
}


// 1. Commencer par critiquer le code écrit en mettant en avant les problèmes
// 2. Proposer une solution(dire ce que vous avez changé et les raisons du changement)


