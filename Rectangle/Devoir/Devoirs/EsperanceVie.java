//PROGRAM MADE BY NUSKA A.K.A ALEKS FOR BdeB 
package Rectangle.Devoir.Devoirs;

import java.util.Scanner;

public class EsperanceVie {

  static String YesNoAnswerMethod(String Response) {
    // I create my Scanner for later use
    Scanner Keyboard = new Scanner(System.in);
    // Make my Yes/No Method Just for the lols this is so unnecessary
    String Answer = Keyboard.next();
    while (!Answer.equalsIgnoreCase("y") && !Answer.equalsIgnoreCase("n") && !Answer.equalsIgnoreCase("Y")
        && !Answer.equalsIgnoreCase("N")) {
      System.out.println("\nInvalid response. Try again.");
      Answer = Keyboard.next();
    }
    return Answer;
  }

  public static void main(String[] args) {
    Scanner Keyboard = new Scanner(System.in);

    // All People start at 80 for life expentency
    final int MinimumAmountOfBLoodPressure = 120;
    int Age = 80;
    int BloodPressure;
    int BlueberryPacksEatenPerYear;

    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Question 1
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    System.out.println("Do you smoke?");
    String Answer1 = YesNoAnswerMethod("");
    if (Answer1.equals("Y") || Answer1.equals("y")) {
      Age = 70;
      System.out.println("You Answered Yes, Next Question");
    } else {
      System.out.println("You Answered No, Next Question");
    }

    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Question 2
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    System.out.println("What is your blood pressure in mm?");
    // WHILE THE NEXT INPUT IS NOT INT YOU TRY AGAIN \n means new line btw
    while (!Keyboard.hasNextInt()) {
      System.out.println("\nInvalid response. Try again.");
      Keyboard.next();
    }
    BloodPressure = Keyboard.nextInt();

    if (BloodPressure < MinimumAmountOfBLoodPressure) {
      System.out.println("Ok Next Question");
    } else {
      BloodPressure = Math.round(BloodPressure / 10) * 10;
      for (int i = BloodPressure; i > MinimumAmountOfBLoodPressure; i = i - 20) {
        Age = Age - 2;
      }
    }

    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Question 3
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    System.out.println("How many blueberry portions do you eat per year?");
    while (!Keyboard.hasNextInt()) {
      System.out.println("\nInvalid response. Try again.");
      Keyboard.next();
    }
    BlueberryPacksEatenPerYear = Keyboard.nextInt();
    if (BlueberryPacksEatenPerYear > 12) {
      Age = Age + 2;
    }
    System.out.println(Age);
    Keyboard.close();
  }

}
// Fin
/*
 * 
 * -------------------------------- ___ - _ ---- _____-_---__-_____
 * --------------------------------/-_-\ |-|----|- ___| | / // ___|
 * -------------------------------/ /_\ \|-|----|-|__-| |/ /-\ `--.
 * ------------------------------ |- _ -||-|----|- __||----\--`--. \
 * -------------------------------|-| |-||-|____| |___| |\ \/\__/ /
 * -------------------------------\_| |_/\_____/\____/\_| \_/\____/
 * 
 * 
 */