package java_fondamentaux;

import java.util.Scanner;

public class Tp5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre :");
        int nombre = input.nextInt();

        if(nombre<0){
            System.out.println("Le nombre est négatif");
        } else if (nombre == 0) {
            System.out.println("Le nombre vaut zéro");
        } else {
            System.out.println("Le nombre est positif");
        }

        if (nombre % 2 ==0 ){
            System.out.println("Le nombre est pair");
        }else
            System.out.println("Le nombre est impair");
    }
}
