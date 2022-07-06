import java.util.Scanner;

public class BoucleForTableMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre :");
        int nombre = input.nextInt();

        System.out.print("Départ :");
        int depart = input.nextInt();

        System.out.print("Arrêt :");
        int arret = input.nextInt();

        System.out.printf("Table de multiplication de %d\n",nombre);

//        compteur+=1 (valeur du pas d'incrémentation)
        for (int compteur = depart; compteur<=arret; compteur++){
            int produit = nombre*compteur;
            System.out.printf("%d x %d = %d\n",nombre, compteur,produit);
        }
    }
}
