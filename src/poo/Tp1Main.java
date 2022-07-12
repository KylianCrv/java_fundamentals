package poo;

public class Tp1Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLargeur(200.5);
        rectangle.setLongueur(250.0);

        double perimetre = rectangle.calculPerimetre();
        double aire = rectangle.calculAire();

        System.out.printf("Largeur : %.2f\nLongueur : %.2f\nPerimetre : %.2f\nAire : %.2f",
                rectangle.getLargeur(),rectangle.getLongueur(),perimetre,aire);
    }
}
