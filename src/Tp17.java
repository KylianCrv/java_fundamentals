import java.util.Scanner;

public class Tp17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Saisissez un nombre : ");
        int nbr = input.nextInt();

        System.out.println(nbr);
        String stringNbr = String.valueOf(Math.abs(nbr));
        String stringNbrInverse = "";

        for (int i= stringNbr.length()-1;i>=0;i--){
            stringNbrInverse = stringNbrInverse+stringNbr.charAt(i);
        }

        for (String lettre: stringNbr.split("")){
            stringNbrInverse = lettre + stringNbrInverse;
        }

        int nbrInverse = Integer.valueOf(stringNbrInverse);
        nbrInverse = nbr>0?nbrInverse:(-1)*nbrInverse;
        System.out.println("Résultat:"+nbrInverse);


    }
}
