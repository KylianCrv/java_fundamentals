package solid.single_responsability.best_practice;

//Ce code respecte le S de Solid (Single responsibility)
public class Customer {
    private int id;
    private String name;
    private boolean activ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActiv() {
        return activ;
    }

    public void setActiv(boolean activ) {
        this.activ = activ;
    }

}

