package java_fondamentaux;

import java.util.HashMap;
import java.util.Locale;

public class HMapConcept {
    public static void main(String[] args) {
//        à partir d'une phrase, affichez le nombre d'occurence de chaque caractère
//        String phrase = "Je suis dev";
        String phrase = "Je suis dans une joie immense. Et je sais que vous aussi.";

        String phraseFormatee = phrase.replaceAll("[^A-Za-z]","").toLowerCase();

//        {j:1, e:2}
        HashMap<Character, Integer> occurrence = new HashMap<>();

        for (int index = 0; index < phraseFormatee.length(); index++) {
            char lettre = phraseFormatee.charAt(index);
            if (occurrence.containsKey(lettre)) {

                int ancienneValeur=occurrence.get(lettre);
                occurrence.replace(lettre, ancienneValeur+1);

            } else {
                occurrence.put(lettre, 1);
            }
        }
        System.out.println(occurrence);
    }
}
