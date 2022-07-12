package poo;

//Constructeur par défaut par défaut : version minimale du constructeur que la JVM invoque lorsque l'on définit aucun constructeur

public class Avion {
    private String fabricant;
    private String modele;
    private int nbSieges;
    private String couleur;

//    Constructeur
    public Avion(String fabricant, String modele, int nbSieges,String couleur){
        this.fabricant=fabricant;
        this.modele=modele;
        this.nbSieges=nbSieges;
        this.couleur=couleur;
    }

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
    public void setFabricant(String fabricant){
        this.fabricant=fabricant;
    }
    public void setModele(String modele){
        this.modele=modele;
    }
    public void setNbSieges(int nbSieges){
        this.nbSieges=nbSieges;
    }
    public void setCouleur(String couleur){
        this.couleur=couleur;
    }
    String nomCompletAvion() {
//        return fabricant+" "+modele;
        return String.format("%s %s", fabricant, modele);
    }
}
