package Rectangle.Devoir;

import java.util.Scanner;

public class Perimetre {
    public static void main(String[] args) {
        Scanner Clavier = new Scanner(System.in);
        System.out.println("ENTREZ LE RAYON");
        double x = Clavier.nextInt();
        System.out.println("ENTREZ LE HAUTEUR");
        double y = Clavier.nextInt();
        double Volume;

        if (x > 0 && y > 0) {
            Volume = (Math.PI * Math.pow(x, 2)) * y;
            System.out.println("Le Volume est " + Volume);
        } else {
            System.out.println("une de vos valeure est negative");
        }
        Clavier.close();
    }
}