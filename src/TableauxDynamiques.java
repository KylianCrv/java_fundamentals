import java.util.ArrayList;

public class TableauxDynamiques {
    public static void main(String[] args) {
        ArrayList<Integer> notes=new ArrayList<>();

        System.out.println("1. Taille du tableau =>"+notes.size());
        notes.add(15);
        notes.add(17);
        notes.add(12);
        notes.add(14);
        System.out.println("2. Taille du tableau =>"+notes.size());
        System.out.println("3. Afficher 15 => "+notes.get(0));


    }
}
