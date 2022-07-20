package tp_validation_acquis;

import java.util.Arrays;
import java.util.Scanner;

public class Tp2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Saisir une chaine de caractère : ");
        String str = input.nextLine();
        str = str.replaceAll(" +"," ");
        String [] words = str.split(" ");
//        for (String word : words){
        for (int i = 0; i< words.length;i++){
            String firstLtr = words[i].substring(0, 1);
            String restLtrs = words[i].substring(1);

            firstLtr = firstLtr.toUpperCase();
            words[i] = firstLtr + restLtrs;
//            System.out.println(words[i]);
       }
        System.out.println(String.join(" ",words));
    }
}
