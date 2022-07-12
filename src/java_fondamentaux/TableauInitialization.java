package java_fondamentaux;

import java.util.Scanner;

public class TableauInitialization {
    public static void main(String[] args) {
        float notes[] = new float[5];

        for (float note : notes) {
            System.out.println(note);
        }

//        Saisir des notes à partir du clavier
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < notes.length; i++) {
            System.out.printf("Saisir la note %d : ", i + 1);
            notes[i]=input.nextFloat();
        }

//        Afficher les notes saisies
        for (float note : notes) {
            System.out.println(note);
        }
    }
}
