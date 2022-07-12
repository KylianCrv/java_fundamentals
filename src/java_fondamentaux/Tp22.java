package java_fondamentaux;

import java.util.Locale;
import java.util.Scanner;

public class Tp22 {

    static Boolean charIsIdentic(String str) {
        boolean isIdentic = false;
        String strFormatee = str.toLowerCase();
        for (int i = 0; i < strFormatee.length(); i++) {
//            char lettre = strFormatee.charAt(i);
            if (i != 0 && strFormatee.charAt(i) == strFormatee.charAt(i-1)){
                isIdentic=true;
            }
        }
        return isIdentic;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mot : ");
        String str = input.nextLine();
        System.out.println(charIsIdentic(str));
    }
}
