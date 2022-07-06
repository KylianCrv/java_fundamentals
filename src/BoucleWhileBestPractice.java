import java.util.Scanner;

public class BoucleWhileBestPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Fixer le nombre de caractères à 4;
//        Demander à l'utilisateur de reesayer tant que le code PIN ne contient pas exactement 4 chiffres

//        Définition du code pin
        System.out.print("Veuillez définir un code pin : ");
        int codePIN = input.nextInt();

//        essayer de déverouiller le telephone avec un code pin
        int codePINATester;

//        Limiter le nombre de tentatives à 3 mais ne pas utiliser la boucle for
        while (true) {
            System.out.print("Entrez un code PIN pour déverouiller l'appareil : ");
            codePINATester = input.nextInt();
            if (codePINATester == codePIN) {
                System.out.println("Appareil déverouillé.");
                break;
            }
            System.out.println("Code PIN erroné. Veuillez réessayer.");
        }
    }
}

