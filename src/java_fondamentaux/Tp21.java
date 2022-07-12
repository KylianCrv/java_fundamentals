package java_fondamentaux;

public class Tp21 {

    static String findPos(int[][] tab, int nb){
        int occ=0;
        int tabLength = tab.length;
        int tabLargeur = tab[0].length;
        StringBuilder finalResult = new StringBuilder();


        for (int i=0;i<tabLength;i++){
            for (int j=0;j<tabLargeur;j++){
                if (nb==tab[i][j]){
                    occ+=1;
//                    finalResult = finalResult + System.out.printf("(%d, %d) ",i,j);
                    finalResult.append(System.out.printf("(%d, %d) ", i, j));
                }
            }
        }
//        return occ + finalResult;
        return occ + finalResult.toString();
    }
    public static void main(String[] args) {
        int[][]tab= {{1, 4, 2, 1}, {6, 3, 8, 9}, {1, 5, 1, 0}};
        System.out.println(findPos(tab,1));
    }
}
