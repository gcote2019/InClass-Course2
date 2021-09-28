package Rectangle.Devoir.Devoirs;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the Number of stars you want");
        int stars = 0;
        int val = 0;
        do {

            stars = keyboard.nextInt();
            if (stars < 0) {
                System.out.println("UHhh thats negative try again");
                stars = keyboard.nextInt();
            }
            while (val < stars) {
                System.out.print("*");
                val++;
            }
            System.out.println("");
            val = 0;

        } while (stars > 0);
        System.out.println("Goodbye!");
        keyboard.close();
    }
}
