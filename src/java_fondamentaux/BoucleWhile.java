package java_fondamentaux;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Définition du code pin
        System.out.print("Veuillez définir un code pin : ");
        int codePIN = input.nextInt();

//        essayer de déverouiller le telephone avec un code pin
        int codePINATester = 0;
        while(codePINATester != codePIN){
            System.out.print("Entrez un code PIN pour déverouiller l'appareil : ");
            codePINATester = input.nextInt();
            if (codePINATester!=codePIN){
                System.out.println("Code PIN erroné. Veuillez réessayer.");
            }else{
                System.out.println("Appareil déverouillé.");
            }
        }
    }
}
