package java_fondamentaux;

import java.util.Scanner;

public class Signe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombre :");
        int nombre = input.nextInt();

//        String parite=nombre%2==0?"pair":"impair";
        boolean isPair = nombre % 2 == 0;

        if (nombre > 0) {
//            System.out.printf("%d est positif et %s", nombre, parite);
            System.out.printf("%d est positif et %s", nombre, isPair ? "pair" : "impair");
        } else if (nombre < 0) {
//            System.out.printf("%d est negatif et %s", nombre, parite);
            System.out.printf("%d est negatif et %s", nombre, isPair ? "pair" : "impair");
        } else {
            System.out.println("0 est pair");
        }
    }
}
