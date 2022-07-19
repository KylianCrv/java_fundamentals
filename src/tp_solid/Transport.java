package tp_solid;

public class Transport extends OptionVoyage {
    private boolean longTrajet;
    private final double TARIF_LONG = 1500.0;
    private final double TARIF_BASE = 200.0+getPrixForfaitaire();

    public Transport(String nom, double prixForfaitaire, boolean longTrajet) {
        super(nom, prixForfaitaire);
        this.longTrajet = longTrajet;
    }

    @Override
    public double prix(){
        if(longTrajet){
            return TARIF_LONG;
        }else return TARIF_BASE;
    }
}
