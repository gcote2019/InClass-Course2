package Rectangle.Devoir.Devoirs;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println(
                "MENU\n-----------\n 1. Afficher le nom du programmeur.\n 2. Afficher l’âge du programmeur.\n 3. Afficher l’humeur du programmeur.\n 4. Quitter ce programme. \n");
        while (!Keyboard.hasNextInt()) {
            System.out.println("\nPlease put a number.");
            Keyboard.next();
        }
        int Choix = Keyboard.nextInt();

        switch (Choix) {
            case 1:
                System.out.println("Aleksandre");
                break;
            case 2:
                System.out.println("16");
                break;
            case 3:
                System.out.println("fatigue");
                break;
            case 4:
                System.out.println("Ok bye bye");
                break;
            default:
                System.out.println("Not one of the choices");
                break;

        }
        Keyboard.close();
    }

}
