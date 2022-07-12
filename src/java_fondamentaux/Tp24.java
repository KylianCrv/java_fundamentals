package java_fondamentaux;

import java.util.Scanner;

public class Tp24 {

    static String pas(int nb) {
        String result = "";
        for (int i = 0; i < nb; i++) {
            result += "#";
            System.out.println("'"+result+" '");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nb de niveaux : ");
        int niveau = input.nextInt();
        System.out.println(pas(niveau));
    }
}
