package java_fondamentaux;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Demander à l'utilisateur : nom, prénom, âge, poids

        System.out.print("Votre nom : ");
        String nom = input.nextLine();

        System.out.print("Votre prénom : ");
        String prenom = input.nextLine();

        System.out.print("Votre âge : ");
        byte age = input.nextByte();

        System.out.print("Votre poids : ");
        float poids = input.nextFloat();
//              Nom : Carvalho
//              Prénom : Kylian
//              Age : 25
//              Poids : 65

//               System.out.printf("Nom : %s\n",nom);
//               System.out.printf("Prénom : %s\n",prenom);
//               System.out.printf("Âge : %d\n", age);
//               System.out.printf("Poids : %f\n", poids);

        System.out.printf("Nom : %s\nPrénom : %s\nAge : %d ans\nPoids : %.2f kg", nom, prenom, age, poids);
    }
}
