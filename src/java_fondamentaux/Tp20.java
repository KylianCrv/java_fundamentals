package java_fondamentaux;

import java.util.Scanner;

public class Tp20 {

    static Boolean isPrefix(String ch1, String ch2) {
        String ch1Str = ch1.toLowerCase();
        String ch2Str = ch2.toLowerCase();

        String prefixe = ch1Str.substring(0,ch2Str.length());

        return prefixe.equals(ch2Str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("chaine 1 : ");
        String ch1 = input.nextLine();
        System.out.print("Chaine 2 : ");
        String ch2 = input.nextLine();
        System.out.println(isPrefix(ch1,ch2));
    }
}
