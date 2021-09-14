package Rectangle.Devoir.Devoirs;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("ON CHECK SI NOMBRE1 EST UN MULTIPLE DE NOMBRE2");
        System.out.println("Enter your first number");
        while (!Keyboard.hasNextInt()) {
            System.out.println("\nInvalid response. Please put a number.");
            Keyboard.next();
        }
        int Nombre1 = Keyboard.nextInt();
        System.out.println("Enter your Second number");
        while (!Keyboard.hasNextInt()) {
            System.out.println("\nInvalid response. Please put a number.");
            Keyboard.next();
        }
        int Nombre2 = Keyboard.nextInt();

        int reponse = Nombre1 % Nombre2;

        if (reponse == 0) {
            System.out.println(Nombre1 + " est un multiple de " + Nombre2);
        } else {
            int i = Nombre2 - reponse;
            Nombre1 += i;
            System.out.println("le prochain multiple est " + Nombre1 + " et " + Nombre2);
        }
    }

}
