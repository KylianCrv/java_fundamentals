import java.util.Scanner;

public class Tp6 {
    public static void main(String[] args) {

        System.out.println("Résolution d'une équation du 2nd degré :\n");

        Scanner inputA = new Scanner(System.in);
        System.out.print("Veuillez entrer la valeur de a :");
        double a = inputA.nextDouble();
        Scanner inputB = new Scanner(System.in);
        System.out.print("Veuillez entrer la valeur de b :");
        double b = inputB.nextDouble();
        Scanner inputC = new Scanner(System.in);
        System.out.print("Veuillez entrer la valeur de c :");
        double c = inputC.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double x1 = ((-b-Math.sqrt(delta))/(2*a));
            double x2 = ((-b+Math.sqrt(delta))/(2*a));
            System.out.printf("L'équation a deux solutions : x1 = %.2f et x2 = %.2f", x1, x2);
        } else if (delta == 0) {
            double x=-(b/(2*a));
            System.out.printf("L'équation a une seule solution : %.2f", x);
        } else {
            System.out.println("L'équation n'a pas de solutions réelles");
        }


    }
}
