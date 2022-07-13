package poo;

public class Patient {
    private double poids;
    private double taille;



    //    GETTERS
    public double getPoids(){
        return poids;
    }

    public double getTaille(){
        return taille;
    }

//SETTERS
    public void setPoids(double poids){
        this.poids=poids;
    }

    public void setTaille(double taille){
        this.taille=taille;
    }

//    Constructeur
    public Patient(double taille, double poids) {
        this.taille = taille;
        this.poids = poids;
    }
    public Patient() {

    }

//    Autres méthodes
    double calculIMC(){
        return poids/(Math.pow(taille,2));
    }

    public String toString(){
        return String.format("Taille du patient : %.2fm\nPoids du patient : %.2fkg\nIMC du patient : %.2f"
                ,taille,poids,calculIMC());
    }
}
