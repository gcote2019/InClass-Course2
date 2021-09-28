/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle.Devoir.PilotageMenu.PilotageMenu.src.pilotagemenu;

import java.util.Scanner;


/**
 *
 * @author georg
 */
public class PilotageMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MENU_NOM = 1;
        final int MENU_AGE = 2;
        final int MENU_HUMEUR = 3;
        final int MENU_QUITTER = 4;

        Scanner clavier = new Scanner(System.in);
        int valeur;

        // Pilotage menu
        // Afficher le menu
        // Et répondre à sa requête
      
        System.out.println("Menu");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Afficher le nom du programmeur.");
        System.out.println("2. Afficher l’âge du programmeur.");
        System.out.println("3. Afficher l’humeur du programmeur.");
        System.out.println("4. Quitter ce programme.");
        System.out.println("----------------------------------------------------");
        
        do {
            

            System.out.println("Menu");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Afficher le nom du programmeur.");
            System.out.println("2. Afficher l’âge du programmeur.");
            System.out.println("3. Afficher l’humeur du programmeur.");
            System.out.println("4. Quitter ce programme.");
            System.out.println("----------------------------------------------------");
            valeur = clavier.nextInt();
            switch (valeur) {
                case MENU_NOM:
                    System.out.println("Mon nom est Bob.");
                    break;
                case MENU_AGE:
                    System.out.println("Mon âge est 32 ans.");
                    break;
                case MENU_HUMEUR:
                    System.out.println("Je suis toujours de bonne humeur!!!");
                    break;
                case MENU_QUITTER:
                    System.out.println("Au revoir.");
                    break;
                default:
                    System.out.println("Vous vous êtes trompé.");
                    break;
                    

            }
          
        } while (!(valeur == MENU_QUITTER));
        clavier.close();
    }

}
