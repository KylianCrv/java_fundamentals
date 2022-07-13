package heritage;

public class Main {
    public static void main(String[] args) {
        var kylian = new Guerrier("Kylian",200,"M16");
        var bamos = new Magicien("Bamos",500,"Baguette Bamos");
        var mamadou = new Sorcier("Mamadou",150,"BaguetteDou","Batonzor");

        kylian.rencontrer();
        bamos.rencontrer();
        mamadou.rencontrer();
        System.out.println("\n");

        System.out.println(kylian);
        System.out.println("\n");
        System.out.println(bamos);
        System.out.println("\n");
        System.out.println(mamadou);
    }
}
