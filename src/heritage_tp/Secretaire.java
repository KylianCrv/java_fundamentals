package heritage_tp;

public class Secretaire extends Direction {
    private String nomLabo;
    private int salaire;

    public String getNomLabo() {
        return nomLabo;
    }

    public void setNomLabo(String nomLabo) {
        this.nomLabo = nomLabo;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public Secretaire(String role, String nom, int anneeArrive, String nomLabo, int salaire) {
        super(role, nom, anneeArrive);
        this.nomLabo = nomLabo;
        this.salaire = salaire;
    }

    @Override
    public boolean estEtudiant(){
        return false;
    }
    public String toString(){
        return super.toString()+ String.format("Laboratoire : %s\nSalaire : %d€\n", nomLabo,salaire);
    }
}
