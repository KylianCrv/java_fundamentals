package heritage_tp;

public class RegularStudent extends Direction{
    private String sectionApprentissage;
    private double noteMoyenne;

    public String getSectionApprentissage() {
        return sectionApprentissage;
    }

    public void setSectionApprentissage(String sectionApprentissage) {
        this.sectionApprentissage = sectionApprentissage;
    }

    public double getNoteMoyenne() {
        return noteMoyenne;
    }

    public void setNoteMoyenne(double noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }

    public RegularStudent(String role, String nom, int anneeArrive, String sectionApprentissage, double noteMoyenne) {
        super(role, nom, anneeArrive);
        this.sectionApprentissage = sectionApprentissage;
        this.noteMoyenne = noteMoyenne;
    }
    @Override
    public boolean estEtudiant(){
        return true;
    }
    public String toString(){
        return super.toString()+ String.format("Section d'apprentissage : %s\nMoyenne : %.2f", sectionApprentissage,noteMoyenne);
    }}
