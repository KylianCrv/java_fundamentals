package poo;

public class SourisMain {
    public static void main(String[] args) {
        Souris souris = new Souris(50,"blanche",2);
        Souris souris2 = new Souris(45,"grise");
        Souris souris3 = new Souris(souris2);
        System.out.println(souris);
        System.out.println(souris2);
        System.out.println(souris3);
        souris.evolue();
        System.out.println(souris);
        souris2.evolue();
        System.out.println(souris2);
        souris3.evolue();
        souris3.vieillir();
        System.out.println(souris3);
    }
}
