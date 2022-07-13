package poo;

public class Souris {
    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;
    private boolean clonee;
    private static final int ESPERANCE_VIE_DEFAULT = 36;
    private static final int AGE_DEFAULT = 0;

//    GETTER && SETTER

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    public void setEsperanceVie(int esperanceVie) {
        this.esperanceVie = esperanceVie;
    }

    public boolean isClonee() {
        return clonee;
    }

    public void setClonee(boolean clonee) {
        this.clonee = clonee;
    }

// CONSTRUCTEURS
    public Souris(Souris souris) {
        this.poids = souris.poids;
        this.couleur = souris.couleur;
        this.age = souris.age;
        this.esperanceVie = (4 * (souris.esperanceVie) / 5);
        this.clonee = true;
        System.out.println("Clonage d'une souris !");
    }

    public Souris(int poids, String couleur, int age) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = ESPERANCE_VIE_DEFAULT;
        System.out.println("Une nouvelle souris !");

    }

    public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = AGE_DEFAULT;
        this.esperanceVie = ESPERANCE_VIE_DEFAULT;
        System.out.println("Une nouvelle souris !");

    }
// Autres méthodes

    public String toString() {
        String isClonee = isClonee() ? ", clonée," : "";
        return String.format("Une souris %s%s de %d mois et pesant %d grammes", couleur,isClonee, age, poids);
//        if (clonee) {
//            return String.format("Une souris %s, clonée, de %d mois et pesant %d grammes", couleur, age, poids);
//        } else {
//            return String.format("Une souris %s, de %d mois et pesant %d grammes", couleur, age, poids);
//        }
    }

    public void vieillir() {
        if (this.clonee && this.age > (this.esperanceVie / 2)) {
            this.couleur = "verte";
        }
    }

    public void evolue() {
        for (int i = this.age; i < this.esperanceVie; i++) {
            this.age++;
        }
    }
}
