package java_fondamentaux;

public class TpTables {
    public static void main(String[] args) {

        for (int i = 2; i <= 10; i++) {
            System.out.printf("Table de multiplication de %d\n", i);
            for (int j = 1; j <= 10;j++){
                int produit = i*j;
                System.out.printf("%d x %d = %d\n",i,j,produit);
            }
        }
    }
}