package poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        Objet => Instance
        Avion boeing737 = new Avion("Boeing","737 Max 10",200,"white");
//        boeing737.setFabricant("Boeing");
//        boeing737.setModele("737 Max 10");
//        boeing737.setNbSieges(200);
//        boeing737.setCouleur("white");

        System.out.printf("%s\n===============\n",boeing737.nomCompletAvion());
        System.out.printf("Marque : %s\nModèle : %s\nNombre de sièges : %d\nCouleur : %s"
                ,boeing737.getFabricant(), boeing737.getModele(),boeing737.getNbSieges(),boeing737.getCouleur());

        System.out.println("\n");

//        Mauvaise approche car on copie la référence => a et boeing737 pointe vers le meme objet
//        Avion a = boeing737;


        Avion airbusA320 = new Avion("Airbus","A320",150,"white");
//        airbusA320.setFabricant("Airbus");
//        airbusA320.setModele("A320");
//        airbusA320.setNbSieges(150);
//        airbusA320.setCouleur("white");
        System.out.printf("%s\n===============\n",airbusA320.nomCompletAvion());
        System.out.printf("Marque : %s\nModèle : %s\nNombre de sièges : %d\nCouleur : %s"
                ,airbusA320.getFabricant(), airbusA320.getModele(),airbusA320.getNbSieges(),airbusA320.getCouleur());

        System.out.println("\n");

//        Utilisation du constructeur de copie
        Avion airbusA330 = new Avion(airbusA320);
//        Compare les références
        System.out.println(airbusA330==airbusA320);
//        Compare les attributs
        System.out.println(airbusA330.equals(airbusA320));



    }
}
