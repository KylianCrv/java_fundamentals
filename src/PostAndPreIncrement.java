public class PostAndPreIncrement {
    public static void main(String[] args) {
        int a = 2;
//        Post Incrementation
//        1. on affecte a b l'ancienne valeur de a (2)
//        2. comme l'incrementation est faite à droite, a augmente de 1
//        3. donc a = 3 et b = 2
        int b = a++;
        System.out.println("a : "+a); //3
        System.out.println("b : "+b);  //2


//        Pré incrementation
//        1. comme l'incrementation est faite à droite, x augmente de 1
//        2. on affecte a y l'ancienne valeur de x (4)
//        3. donc x = 4 et y = 4

        int x = 3;
        int y = ++x;

        System.out.println("x : "+x);
        System.out.println("y : "+y);

    }
}
