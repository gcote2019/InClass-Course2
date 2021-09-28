package Rectangle.Devoir.Devoirs;

//IMPORTS
import java.util.Scanner;

public class Exercice5 {

    public static void main(String[] args) {
        // MAKE A RANDOM NUMBER FUNCTION

        // CREATE GUI
        // ---------------------------------------------------------------------------------------

        // ---------------------------------------------------------------------------------------
        // GET PLAYER INPUTS

        Scanner Clavier = new Scanner(System.in);
        System.out.println("Enter A Number");
        int Number1 = Clavier.nextInt();
        System.out.println("Enter A Number");
        int Number2 = Clavier.nextInt();
        System.out.println("Enter A Number");
        int Number3 = Clavier.nextInt();

        int TheBiggestNumber = 0;
        // Table where I put all the players points
        int myNumbers[] = { Number1, Number2, Number3 };
        // Loop through the Table(array) and I check if is bigger than the last value
        for (int i : myNumbers) {
            int Number = i;
            if (Number > TheBiggestNumber) {
                TheBiggestNumber = Number;
            }
        }
        System.out.println("The Biggest Number is " + TheBiggestNumber);

        // ---------------------------------------------------------------------------------------
        // ---------------------------------------------------------------------------------------
        Clavier.close();
    }

}