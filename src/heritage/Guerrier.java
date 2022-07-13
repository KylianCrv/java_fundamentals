package heritage;

public class Guerrier extends Personnage {

    private String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        super(nom, dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public void rencontrer() {
        System.out.println("Je vais te tuer.");
    }

}
