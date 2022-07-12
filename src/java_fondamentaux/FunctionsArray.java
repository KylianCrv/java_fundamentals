package java_fondamentaux;

import java.util.Arrays;

public class FunctionsArray {
//    {1,2,3,4,5}
//    {6,7,8,9,10}
//    {7,9,11,13,15}

    static int[] produceSumArray(int[] array1, int[] array2) throws Exception {
        if (array1.length != array2.length) {
            throw new Exception("Les deux tableaux n'ont pas la meme taille");
        }
        int taille = array1.length;
        int[] resultArray = new int[taille];
        for (int i = 0; i < taille; i++) {
            resultArray[i] = array1[i] + array2[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int tab1[] = {1, 2, 3, 4, 5};
        int tab2[] = { 6,7, 8, 9, 10};
//        int[] resultTab = produceSumArray(tab1, tab2);
        try {
            int[] resultTab = produceSumArray(tab1, tab2);
            System.out.println(Arrays.toString(resultTab));

        } catch (Exception err) {
            System.out.println("Erreur => " + err);
        }
    }
}
