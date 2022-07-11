import java.util.Scanner;
import java.lang.StringBuilder;

public class Tp16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Saisissez une chaine de caractère : ");
        String chaine = input.nextLine();
        System.out.println(chaine);

        String chaineFormatee = "";
        String reverse = "";
        for (int i = (chaine.length() - 1); i >= 0; i--) {
            chaineFormatee += chaine.charAt(i);
        }

        for (int i = 0; i < chaine.length(); i++) {
            reverse = chaine.charAt(i) + reverse;
        }
        System.out.println(chaineFormatee);
        System.out.println(reverse);


//        StringBuilder chaineReverse = new StringBuilder(chaine);
//        chaine = chaineReverse.reverse().toString();
//        System.out.println(chaine);
    }

}
