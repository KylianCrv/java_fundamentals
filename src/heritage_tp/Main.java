package heritage_tp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var permanentStudent1 = new RegularStudent("Etudiant régulier", "Chris Lisangola",
                2013, "Physique", 15);
        var permanentStudent2 = new RegularStudent("Etudiant régulier", "JIhane Cheddadi",
                2011, "Math Info", 19.4);
        var exchangeStudent1 = new ExchangeStudent("Etudiant d'échange", "Bjorn cote de Fer",
                2012, "Physique", "Paris 40");
        var enseignant = new Enseignant("Enseignant", "Zinedine Benzema",
                1998, "Physique", 20000, "Physique");
        var secretaire = new Secretaire("Secrétaire", "Christiane Lisangolanne",
                2005, "Chimie", 5000);
//        System.out.println(permanentStudent1);
//        System.out.println();
//        System.out.println(permanentStudent2);
//        System.out.println();
//        System.out.println(exchangeStudent1);
//        System.out.println();
//        System.out.println(enseignant);
//        System.out.println();
//        System.out.println(secretaire);

        ArrayList<Direction> list = new ArrayList<>();
        list.add(permanentStudent1);
        list.add(permanentStudent2);
        list.add(exchangeStudent1);
        list.add(enseignant);
        list.add(secretaire);
        int nbEtudiant = 0;

        for (Direction direction : list) {
            if (direction.estEtudiant()) {
                nbEtudiant++;
            }
            System.out.println("\n" + direction);
        }
//        for (int i = 0; i<list.size();i++) {
//            if (list.get(i).estEtudiant()) {
//                nbEtudiant++;
//            }
//            System.out.println("\n" + list.get(i));
//        }
        System.out.printf("%d personnes dont %d étudiants fréquentent CLBIT\n", list.size(),nbEtudiant);

    }
}
