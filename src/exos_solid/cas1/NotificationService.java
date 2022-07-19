package exos_solid.cas1;

class NotificationService {
    //    Envoyer une notification de OTP pour chaque type d'opération bancaire
//    Par email ou mobile ou whatsapp
    private Notifications notif;

    public NotificationService(Notifications notif) {
        this.notif = notif;
    }

    void sendNotifOTP() {
        notif.sendOTP();
    }

    void sendTransactionReport() {
        notif.sendTransactionReport();
    }
}
