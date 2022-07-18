package solid.single_responsability.bad_practice;

import java.util.ArrayList;

//1.La liste doit etre à l'extérieur de la classe
//2.ajout/suppression ne doit pas etre dans la classe Customer (principe KISS)
public class CustomerBadPractice {
    private int id;
    private String name;
    private boolean activ;

    private ArrayList<CustomerBadPractice> customers;
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

    public void addCustomer(CustomerBadPractice customer){
        this.customers.add(new CustomerBadPractice());
    }

    public void deleteCustomer(CustomerBadPractice customer){
        this.customers.remove(id);
    }
}
