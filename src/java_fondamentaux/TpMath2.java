package java_fondamentaux;

public class TpMath2 {
    public static void main(String[] args) {
//Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
//Entrez la première valeur(a) : 51
//Entrez la deuxième valeur(b) : 876
//Entrez la troisième valeur(c) : 235
//Les valeurs entrées sont : a = 51, b = 876 et c = 235
//Permutation: b <== a, c <== b, a <== c
//Les valeurs permutées sont : a = 235, b = 51 et c = 876

        int a = 51;
        int b = 876;
        int c = 235;
        int temp ;
        System.out.printf("Avant permutation a = %d\nb = %d\nc = %d\n",a,b,c);

        temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.printf("Après permutation a = %d\nb = %d\nc = %d",a,b,c);

    }
}
