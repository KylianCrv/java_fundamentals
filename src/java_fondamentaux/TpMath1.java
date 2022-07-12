package java_fondamentaux;

import java.util.Scanner;

public class TpMath1 {
//    1 .Ecrire un programme Java qui demande à l’utilisateur de saisir la valeur du diamètre,
//    et qui ensuite va effectuer le calcul de la surface.
//    Surface = Rayon x Rayon x PI;
//    Rayon = Diamètre / 2

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diametre :");
        double diametre=input.nextDouble();
        double rayon=diametre/2;
        double surface=Math.pow(rayon,2)*Math.PI;

        System.out.printf("Surface : %.4f", surface);
    }

}
