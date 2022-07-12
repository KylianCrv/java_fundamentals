package java_fondamentaux;

public class StringType {
    public static void main(String[] args) {
        String phrase="Je suis développeur";

        System.out.println("Taille de la chaine de 'phrase' :"+phrase.length());
        System.out.println("Afficher la lettre a la position 0 :"+phrase.charAt(0));
        System.out.println("La position de la première occurence de S : " +phrase.indexOf('s'));

        int taille = phrase.length();
        System.out.println("Afficher le dernier élément de la chaine : "+phrase.charAt(taille-1));

//        Extraire une sous-chaine
        String dev=phrase.substring(8,18);//[début, fin[
        System.out.println(dev);
    }
}
