package heritageTP;

public class ExchangeStudent extends Direction{
    private String sectionApprentissage;
    private String universiteOrigine;

    public String getSectionApprentissage() {
        return sectionApprentissage;
    }

    public void setSectionApprentissage(String sectionApprentissage) {
        this.sectionApprentissage = sectionApprentissage;
    }

    public String getUniversiteOrigine() {
        return universiteOrigine;
    }

    public void setUniversiteOrigine(String universiteOrigine) {
        this.universiteOrigine = universiteOrigine;
    }

    public ExchangeStudent(String role, String nom, int anneeArrive, String sectionApprentissage, String universiteOrigine) {
        super(role, nom, anneeArrive);
        this.sectionApprentissage = sectionApprentissage;
        this.universiteOrigine = universiteOrigine;
    }

    @Override
    public boolean estEtudiant(){
        return true;
    }
    public String toString(){
        return super.toString()+ String.format("Section d'apprentissage : %s\nUniversité d'origine : %s", sectionApprentissage,universiteOrigine);
    }
}
