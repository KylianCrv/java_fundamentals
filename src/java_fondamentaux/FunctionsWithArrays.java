package java_fondamentaux;

public class FunctionsWithArrays {

    static int sumArray(int[] numbersArray){
        int somme=0;
        for (int number : numbersArray){
            somme=somme+number;
        }
        return somme;
    }

    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8};
        System.out.println(sumArray(numbers));
    }
}
