package java_fondamentaux;

import java.util.Scanner;

public class FunctionsIntro {

    static int somme(int nb1, int nb2){
        int resultat = nb1 + nb2;
        return resultat;
    }

    static String deleteSpecialChar(String chaine){
        String newStr = chaine.replaceAll("[^A-Za-z]","").toLowerCase();
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(somme(4,5));

//        Demande de saisie utilisateur
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez les deux nombres : ");
        int nb1=input.nextInt();
        int nb2=input.nextInt();
        System.out.println(somme(nb1,nb2));
    }
}
