import java.util.Scanner;

public class Tp14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tab[]= new int[10];
        int compteur = 0;


        for(int i=0; i< tab.length;i++){
            System.out.printf("Veuillez saisir la valeur %d :", i+1);
            int nbr = input.nextInt();
            tab[i]=nbr;
        }

        System.out.print("Veuillez saisir la valeur a rechercher dans le tableau : ");
        int nbrAChercher = input.nextInt();

        for (int j : tab) {
            if (j == nbrAChercher) {
                compteur++;
            }
        }
        if (compteur>0){
            System.out.printf("la valeur %d apparait %d fois dans le tableau", nbrAChercher, compteur);
        }else{
            System.out.println("La valeur n'existe pas dans le tableau");
        }

    }
}
