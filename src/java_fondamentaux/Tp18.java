package java_fondamentaux;

import java.util.HashMap;
import java.util.Scanner;

public class Tp18 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("1ere chaine de caractere : ");
        String phrase1 = input.nextLine();
        System.out.print("2eme chaine de caractere : ");
        String phrase2 = input.nextLine();

        String phrase1Formatee = phrase1.replaceAll("[^A-Za-z]","").toLowerCase();
        String phrase2Formatee = phrase2.replaceAll("[^A-Za-z]","").toLowerCase();

        HashMap<Character, Integer> occurrence = new HashMap<>();

    }
}
