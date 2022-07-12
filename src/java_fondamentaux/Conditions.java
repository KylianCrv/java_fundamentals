package java_fondamentaux;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Votre age : ");
        byte age = input.nextByte();

        boolean estMajeur = age >= 18; //true//false

//        si age > = 18 alors
//        Afficher "Vous etes majeur"
//        sinon
//        Afficher "vous etes mineur"

        if (estMajeur) {
            System.out.println("Vous etes majeur dans certains pays");
        } else {
            System.out.println("Vous etes mineur");
        }

//        Test d'égalité
        int a=1, b=2;
        if(a==b){
            System.out.println("a et b sont égaux");
        }else{
            System.out.println("a et b sont différents");
        }

//        Test de différence
        if(a!=b){
            System.out.println("a et b sont différents");
        }else{
            System.out.println("a et b sont égaux");
        }

//        Utilisation d'expression dans les conditions
        if(a*2>b*2){
            System.out.println("a*2 est > à b*2");
        }else{
            System.out.println("a-2 n'est pas > à b*2");
        }
    }
}
