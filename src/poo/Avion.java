package poo;

public class Avion {
    String fabricant;
    String modele;
    int nbSieges;
    String couleur;

    String nomCompletAvion(){
//        return fabricant+" "+modele;
        return String.format("%s %s",fabricant, modele);
    }
}
