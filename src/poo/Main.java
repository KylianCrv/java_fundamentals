package poo;

public class Main {
    public static void main(String[] args) {
//        Objet => Instance
        Avion boeing737 = new Avion();
        boeing737.fabricant="Boeing";
        boeing737.modele="737 Max 10";
        boeing737.nbSieges=200;
        boeing737.couleur="white";

        System.out.printf("%s\n===============\n",boeing737.nomCompletAvion());
        System.out.printf("Marque : %s\nModèle : %s\nNombre de sièges : %d\nCouleur : %s"
                ,boeing737.fabricant, boeing737.modele,boeing737.nbSieges,boeing737.couleur);

        System.out.println("\n");

        Avion airbusA320 = new Avion();
        airbusA320.fabricant="Airbus";
        airbusA320.modele="A320";
        airbusA320.nbSieges=150;
        airbusA320.couleur="white";
        System.out.printf("%s\n===============\n",airbusA320.nomCompletAvion());
        System.out.printf("Marque : %s\nModèle : %s\nNombre de sièges : %d\nCouleur : %s"
                ,airbusA320.fabricant, airbusA320.modele,airbusA320.nbSieges,airbusA320.couleur);
    }
}
