package tp_validation_acquis;

public class Tp1 {
    public static void main(String[] args) {
         int[] tab ={12,3,5,6,-3};
         int taille = tab.length;
         int max = tab[0];
        int min = tab[0];
//         méthode pour afficher le tableau
        for(int i = 0; i<taille;i++){
            System.out.println(tab[i]);

            //méthode pour aller chercher le plus grand nombre du tableau
            if (tab[i]>max){
                max = tab[i];
            } else if (tab[i]<min) {
                min = tab[i];
            }
        }
        System.out.printf("Plus grand nombre : %d\n",max);
        System.out.printf("Plus petit nombre : %d",min);

    }
}
