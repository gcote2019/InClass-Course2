package Rectangle.Devoir.Devoirs;

//IMPORTS

import java.util.Scanner;

public class Loops{
    int Chiffre;
    Scanner Keyboard = new Scanner(System.in);
    public static void main(String[] args){
        while (!Keyboard.hasNextInt()>0) {
            System.out.println("Mets un autre chiffre");
            Keyboard.next();
          
          }
          Chiffre = Keyboard.nextInt();
          System.out.println(Chiffre);
    }
}