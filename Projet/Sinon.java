package Projet;

public class Sinon {

    public static void main(String[] args) {
        int Valeur = 34;
        int Valeur2 = -23;
        if (Valeur < 0 && Valeur2 < 0) {
            System.out.println("Deux negative");
        } else if (Valeur > 0 && Valeur2 > 0) {
            System.out.println("both positive");
        } else {
            System.out.println("one negative one positive");
        }
    }

}
