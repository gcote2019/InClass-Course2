package Projet;

public class test {
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        int Valeur = 3600;
        while (Valeur > 0) {
            wait(1000);
            Valeur = Valeur - 1;
            System.out.println(Valeur);
        }
        System.out.println("Wake up");
    }

}
