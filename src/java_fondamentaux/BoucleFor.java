package java_fondamentaux;

public class BoucleFor {
    public static void main(String[] args) {
//        System.out.printf("le carré de 1 est %f", Math.pow(1,2));
//        System.out.printf("le carré de 2 est %f", Math.pow(2,2));
//        System.out.printf("le carré de 3 est %f", Math.pow(3,2));
//        System.out.printf("le carré de 4 est %f", Math.pow(4,2));
//        System.out.printf("le carré de 5 est %f", Math.pow(5,2));
//        System.out.printf("le carré de 6 est %f", Math.pow(6,2));
//        System.out.printf("le carré de 7 est %f", Math.pow(7,2));
//        System.out.printf("le carré de 8 est %f", Math.pow(8,2));
//        System.out.printf("le carré de 9 est %f", Math.pow(9,2));
//        System.out.printf("le carré de 10 est %f", Math.pow(10,2));

//        pour compteur allant de 1 à 10
//        afficher le carré du nombre
//        compteur = compteur +1
//        fin pour
        for (int compteur=1;compteur<=10;compteur = compteur+1){
            System.out.printf("Le carré de %d est %.0f\n",compteur, Math.pow(compteur,2));
        }

    }
}
