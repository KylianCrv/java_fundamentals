package poo;

import java.util.Scanner;

public class TpPersonneMain {
    public static void main(String[] args) {
        User personne = new User();
        Scanner input = new Scanner(System.in);

        System.out.print("Nom : ");
        personne.setNom(input.nextLine());

        System.out.print("Prénom : ");
        personne.setPrenom(input.nextLine());

        System.out.print("Nombre d'enfants : ");
        personne.setNbEnfants(input.nextInt());

        System.out.print("Situation maritale : ");
        personne.setMarie(input.next());

        System.out.println("\n");

        System.out.printf("Informations sur l'utilisateur\n" +
                "=================\n" +
                "%s\n%d enfants à charges\n%s",personne.nomComplet(),personne.getNbEnfants(),personne.getMarie());


    }
}
