package java_fondamentaux;

import java.util.Scanner;

public class Tp9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez définir un email : ");
        String email = input.nextLine();
        System.out.print("Veuillez définir un mdp : ");
        String mdp = input.nextLine();

        String verifEmail;
        String verifMdp;

        while (true) {
            System.out.print("Veuillez entrer votre email : ");
            verifEmail = input.nextLine();
            if (email.equals(verifEmail)) {
                System.out.print("Veuillez saisir votre mot de passe : ");
                verifMdp = input.nextLine();
                if (mdp.equals(verifMdp)) {
                    System.out.println("Bienvenue dans votre espace client");
                    break;
                } else {
                    System.out.println("Identifiants incorrects");
                }
            }else {
                System.out.println("Identifiants incorrects");
            }
        }
    }
}
