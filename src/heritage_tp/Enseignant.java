package heritage_tp;

public class Enseignant extends Secretaire{
    private String sectionEnseignement;

    public String getSectionEnseignement() {
        return sectionEnseignement;
    }

    public void setSectionEnseignement(String sectionEnseignement) {
        this.sectionEnseignement = sectionEnseignement;
    }

    public Enseignant(String role, String nom, int anneeArrive, String nomLabo, int salaire, String sectionEnseignement) {
        super(role, nom, anneeArrive, nomLabo, salaire);
        this.sectionEnseignement = sectionEnseignement;
    }

    @Override
    public boolean estEtudiant(){
        return false;
    }
    public String toString(){
        return super.toString()+ String.format("Section d'enseignement : %s", sectionEnseignement);
    }
}
