package heritage;

public class Main {
    public static void main(String[] args) {
        var kylian = new Guerrier("Kylian",200,"M4");
        var bamos = new Magicien("Bamos",500,"Baguette Bamos");
        var mamadou = new Sorcier("Mamadou",150,"BaguetteDou","Batonzor");
        System.out.println(kylian);
        System.out.println(bamos);
        System.out.println(mamadou);
    }
}
