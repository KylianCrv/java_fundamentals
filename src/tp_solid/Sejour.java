package tp_solid;

public class Sejour extends OptionVoyage{
    private int nbNuit;
    private double prixParNuit;


    public Sejour(String nom, double prixForfaitaire, int nbNuit, double prixParNuit) {
        super(nom, prixForfaitaire);
        this.nbNuit = nbNuit;
        this.prixParNuit = prixParNuit;
    }

    public int getNbNuit() {
        return nbNuit;
    }

    public void setNbNuit(int nbNuit) {
        this.nbNuit = nbNuit;
    }

    public double getPrixParNuit() {
        return prixParNuit;
    }

    public void setPrixParNuit(double prixParNuit) {
        this.prixParNuit = prixParNuit;
    }

    @Override
    public double prix(){
        return (nbNuit*prixParNuit)+getPrixForfaitaire();
    }
}
