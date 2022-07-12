package poo;

public class User {
    private String nom;
    private String prenom;
    private int nbEnfants;
    private String marie;


    public int getNbEnfants() {
        return nbEnfants;
    }

    public String getMarie() {
        return marie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNbEnfants(int nbEnfants) {
        this.nbEnfants = nbEnfants;
    }

    public void setMarie(String marie) {
        this.marie = marie;
    }

    public String nomComplet() {
        return prenom + " " + nom;
    }
}
