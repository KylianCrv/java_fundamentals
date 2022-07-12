package java_fondamentaux;

public class Datatypes {
    public static void main(String[] args) {
        //Chaîne de caractères

        String prenom="Kylian";
        String nom="Carvalho";
        String nomComplet=prenom+" "+nom;

        //Caractère
        char genre='M';

        //Réels
        //Poids : 65.025
        //Prix 45.78€
        float poids=65.5F;
        float tarif=8.4F;

        //Réels double précision
        double v=45.3;

        //Byte : variante d'entier court
        byte age=25;

        System.out.println("Je suis "+nomComplet+", j'ai "+age+" ans. Mon tjm est de "+tarif+"€");

        System.out.printf("Je suis %s %s, j'ai %d ans.\nMon tjm est de %.1f€.", prenom,
                nom,
                age,
                tarif);
    }
}
