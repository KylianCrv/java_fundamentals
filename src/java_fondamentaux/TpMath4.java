package java_fondamentaux;

import java.util.Scanner;


public class TpMath4 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("a =");
        int a = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("b =");
        int b = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.print("c =");
        int c = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.print("x =");
        double x = input4.nextDouble();
//        ((a+b)/2)x3 + (a+b)2x2 + a + b + c
        double resultat =(Math.pow(x,3)*((double)(a+b)/(double)2) + Math.pow(x,2)*Math.pow(a+b,2) + a + b + c);

        System.out.printf("Valeur %.4f",resultat);
    }
}
