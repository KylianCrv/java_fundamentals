package tp_validation_acquis;

import java.util.Arrays;
import java.util.Scanner;

public class Tp3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Veuillez saisir une phrase : ");
        String str = input.nextLine();
        System.out.printf("Vous avez saisi : %s\n", str);

        String strFormatee = str.replaceAll(" +"," ").toLowerCase();
        String[] words = strFormatee.split(" ");
        int compteur;
        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
            compteur = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    compteur++;
                    words[j] = "0";
                }
            }
            if (compteur > 1 && words[i] != ("0")) {
                System.out.printf("Le mot %s est en doublon %d fois\n", words[i], compteur);
            }
            strFormatee = String.join(" ", words);
            strFormatee = strFormatee.replaceAll("0","");
        }
        System.out.println(strFormatee);
    }
}
