import java.util.Scanner;

public class Tp12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        int n = input.nextInt();

        for (int compteur = 1; compteur <= n; compteur++) {

            if (compteur % 3 == 0 && compteur % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (compteur % 5 == 0) {
                System.out.println("buzz");
            } else if (compteur % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(compteur);
            }
        }
    }
}
