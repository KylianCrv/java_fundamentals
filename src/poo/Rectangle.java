package poo;

public class Rectangle {

    private double largeur;

    private double longueur;


    public double getLargeur(){
        return largeur;
    }

    public double getLongueur(){
        return longueur;
    }

    public void setLongueur(double longueur){
        this.longueur=longueur;
    }

    public void setLargeur(double largeur){
        this.largeur=largeur;
    }

    public double calculPerimetre(){
        return 2*(longueur + largeur);
    }

    public double calculAire(){
        return longueur*largeur;
    }
}
