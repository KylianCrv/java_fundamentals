package tp_validation_acquis;

import java.util.Arrays;

public class Tp5 {
    public static void main(String[] args) {

        char[] tab={'a','b','c','d','e'};
        System.out.println(Arrays.toString(maMethode(tab)));
    }

    public static char[] maMethode(char[]tab){
        for(int i = 0 ; i<tab.length;i++){
            if (i % 2 != 0){
                tab[i]=Character.toUpperCase(tab[i]);
            }
        }
        return tab;
    }
}
