package poo;

public class Avion {
    private String fabricant;
    private String modele;
    private int nbSieges;
    private String couleur;

//    GETTERS ou Accesseurs
    public String getFabricant() {
        return fabricant;
    }
    public String getModele() {
        return modele;
    }
    public int getNbSieges() {
        return nbSieges;
    }
    public String getCouleur() {
        return couleur;
    }

//    SETTERS ou Manipulateurs
    public void setFabricant(String nouvelleValeur){
        fabricant=nouvelleValeur;
    }
    public void setModele(String nouvelleValeur){
        modele=nouvelleValeur;
    }
    public void setNbSieges(int nouvelleValeur){
        nbSieges=nouvelleValeur;
    }
    public void setCouleur(String nouvelleValeur){
        couleur=nouvelleValeur;
    }
    String nomCompletAvion() {
//        return fabricant+" "+modele;
        return String.format("%s %s", fabricant, modele);
    }
}
