package java_fondamentaux;

import java.util.Scanner;
import java.util.Calendar;

public class TpMath3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quel age avez vous ? ");
        int age = input.nextInt();
        int rightNow = Calendar.getInstance().get(Calendar.YEAR);
        int annee = rightNow - age;

        System.out.printf("Vous etes né en %d",annee);
    }
}
