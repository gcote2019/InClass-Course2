package Rectangle.Devoir;
//IMPORTS


import javax.swing.JFrame;

import java.util.Scanner;

public class Bignumber extends JFrame {

    public static void main(String[] args) {
        // MAKE A RANDOM NUMBER FUNCTION

        // CREATE GUI
        // ---------------------------------------------------------------------------------------
        // ---------------------------------------------------------------------------------------
        Bignumber gui = new Bignumber();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(500, 500);
        gui.setVisible(true);
        gui.setTitle("First GUI");
        // ---------------------------------------------------------------------------------------
        int Plr3Pts = (int) (Math.random() * 11);
        int Plr4Pts = (int) (Math.random() * 11);
        int Plr2Pts = (int) (Math.random() * 11);

        // ---------------------------------------------------------------------------------------
        // GET PLAYER INPUTS
        System.out.println(
                "Here are the Other players numbers Player 2 is going to choose a Number make sure yours is Higher BUT not the same as his");
        System.out.println("Player 3 put " + Plr3Pts);
        System.out.println("Player 4 put " + Plr4Pts);

        Scanner Clavier = new Scanner(System.in);

        System.out.println("Enter A Number from 0 to 10");
        int Points = Clavier.nextInt();
        int Plr1Pts = Points;

        int TheBiggestNumber = 0;
        // Table where I put all the players points
        int myNumbers[] = { Plr3Pts, Plr4Pts };
        // Loop through the Table(array) and I check if is bigger than the last value

        for (int i : myNumbers) {
            int Number = i;
            if (Number > TheBiggestNumber) {
                TheBiggestNumber = Number;
            }
        }
        System.out.println("Player 2 picked " + Plr2Pts);
        if (Plr1Pts > Plr2Pts && Plr1Pts != TheBiggestNumber) {
            System.out.println("YOU WON!");
        } else if (Plr1Pts == TheBiggestNumber) {
            System.out.println("YOU LOST!, You picked the same number as someone else");
        } else {
            System.out.println("YOU LOST!");
        }

        // ---------------------------------------------------------------------------------------
        // ---------------------------------------------------------------------------------------
        Clavier.close();
    }

}