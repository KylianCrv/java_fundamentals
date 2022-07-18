package poo;


public enum Direction {
    ENSEIGNANT,
    SECRETAIRE,
    ETUDIANT_REGULIER,
    ETUDIANT_ECHANGE
}

class MainEnum{
    public static void main(String[] args) {
        Direction etudiant = Direction.ETUDIANT_ECHANGE;
    }
}