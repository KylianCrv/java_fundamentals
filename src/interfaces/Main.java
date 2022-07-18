package interfaces;

public class Main {
    public static void main(String[] args) {
        var superman = new SuperHerosVolant("Clark Kent", "23/10/1889", 500, 1000);
        var flash = new SuperHerosCourant("Barry Allen", "03/05/1990", 300, 7000);
        var insecte = new MechantInsecte("Jeff Goldblum", "05/05/1790");

        var action = new Actions();
        action.presenterUnPersonnageVolant(superman);
        action.presenterUnPersonnageVolant(insecte);
    }
}
