package java_fondamentaux;

import java.util.Scanner;


public class OperateursLogiques {
    public static void main(String[] args) {
//        Demander à l'utilisateur son age
//        si age entre 10 et 19
//        afficher "vous etes ado"
//        sinon
//        afficher "vous etes pas ado"
        var input = new Scanner(System.in);
        System.out.print("Votre age :");
        byte age = input.nextByte();

//        Utilisation de l'opérateur AND => &&
        if (age >= 10 && age <= 19) {
            System.out.println("Vous etes ado");
        } else {
            System.out.println("vous n'etes pas ado");
        }

//        Utilisation de l'operateur OR => ||
        if (age >= 10 || age <= 19) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
