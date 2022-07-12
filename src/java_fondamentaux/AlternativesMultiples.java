package java_fondamentaux;

import java.util.Scanner;

public class AlternativesMultiples {
    public static void main(String[] args) {
//        Demander d'entrer le nom du pays
//        Afficher "bonjour"
//        Si Espagne
//        Afficher "hola"
//        si Allemagne
//        afficher "guten tag"
//        si angleterre
//        afficher hello gm
//        sinon
//        pays non reconnu
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez entrer un pays : ");
        String pays = input.nextLine();
        if (pays.equals("France")) {
            System.out.println("Bonjour !");
        } else if (pays.equals("Espagne")) {
            System.out.println("Hola !");
        } else if (pays.equals("Allemagne")) {
            System.out.println("Guten Tag !");
        } else if (pays.equals("Angleterre")) {
            System.out.println("Hellooooo good morning");
        } else
            System.out.println("Pays invalide");

    }
}
