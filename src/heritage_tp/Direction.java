package heritage_tp;

public abstract class Direction {
    private String role;
    private String nom;
    private int anneeArrive;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnneeArrive() {
        return anneeArrive;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAnneeArrive(int anneeArrive) {
        this.anneeArrive = anneeArrive;
    }

    public Direction(String role,String nom, int anneeArrive) {
        this.role = role;
        this.nom = nom;
        this.anneeArrive = anneeArrive;

    }

    public abstract boolean estEtudiant();

    public String toString(){
        return String.format("%s :\nNom : %s\nAnnée d'arrivée : %d\n",role,nom,anneeArrive);
    }
}
