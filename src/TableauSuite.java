public class TableauSuite {
    public static void main(String[] args) {
        float notes[] = {15.5F, 18.2F, 13.2F, 10, 14.6F};
//        Mauvaise approche d'affichage
//        System.out.println(notes[1]);
//        System.out.println(notes[2]);
//        System.out.println(notes[0]);
//        System.out.println(notes[3]);
//        System.out.println(notes[4]);

//        Bonne approche d'affichage

        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }

        //        calcul de la somme
        float sommeNotes = 0;
        for (int i = 0; i < notes.length; i++) {
            sommeNotes = sommeNotes + notes[i];
        }
        System.out.println("Somme des notes : " + sommeNotes);

//        moyenne des notes
        float moyenneNotes = sommeNotes/notes.length;
        System.out.println("Moyenne de l'étudiant : "+moyenneNotes);

    }
}
