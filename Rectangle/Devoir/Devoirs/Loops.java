package Rectangle.Devoir.Devoirs;

//IMPORTS

import java.util.Scanner;

public class Loops{
   
   
    public static void main(String[] args){
      int Val = 2;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter the Number of stars you want to count to");
      int MaxNumber = keyboard.nextInt();
     while(Val < MaxNumber){
        Val += 2;
        System.out.println(Val);
      }
        keyboard.close();
    }  
}