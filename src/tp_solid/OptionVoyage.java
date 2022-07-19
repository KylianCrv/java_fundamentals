package tp_solid;

public class OptionVoyage {
    private String nom;
    private double prixForfaitaire;

    public OptionVoyage(String nom, double prixForfaitaire) {
        this.nom = nom;
        this.prixForfaitaire = prixForfaitaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixForfaitaire() {
        return prixForfaitaire;
    }

    public void setPrixForfaitaire(double prixForfaitaire) {
        this.prixForfaitaire = prixForfaitaire;
    }

    public double prix() {
        return prixForfaitaire;
    }

    @Override
    public String toString(){
        return String.format("%s -> %.2f", nom, prixForfaitaire);
    }
}
