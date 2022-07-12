package java_fondamentaux;

import java.util.Scanner;
import java.util.Arrays;

public class Tp13 {
    public static void main(String[] args) {
        int array1[]= new int[5];
        int array2[]= new int[6];
        int array3[] = new int[3];
        int arrayMultiple3[] = new int[array1.length + array2.length + array3.length];
int index=0;
int finalSum = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Saisir l'entier pour le tableau 1 la valeur %d : ", i + 1);
            array1[i]=input.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("Saisir l'entier pour le tableau 2 la valeur %d : ", i + 1);
            array2[i]=input.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.printf("Saisir l'entier pour le tableau 3 la valeur %d : ", i + 1);
            array3[i]=input.nextInt();
        }

        String array1String = Arrays.toString(array1);
        System.out.println("Tableau 1 : "+array1String);

        String array2String = Arrays.toString(array2);
        System.out.println("Tableau 2 : "+array2String);

        String array3String = Arrays.toString(array3);
        System.out.println("Tableau 3 : "+array3String);

        for (int nbr:array1) {
            if(nbr % 3 ==0){
                arrayMultiple3[index] = nbr;
                index++;
            }
        }
        for (int nbr:array2) {
            if(nbr % 3 ==0){
                arrayMultiple3[index] = nbr;
                index++;
            }
        }
        for (int nbr:array3) {
            if(nbr % 3 ==0){
                arrayMultiple3[index] = nbr;
                index++;
            }
        }

        System.out.println("S =");
        for (int nbr:arrayMultiple3){
            finalSum = finalSum + nbr;
            if (nbr !=0){
                System.out.printf("%d +", nbr);
            }
            System.out.println(" = "+finalSum);
        }
    }
}
