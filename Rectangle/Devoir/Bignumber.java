package Rectangle.Devoir;

public class Bignumber {
    public static void main(String[] args) {
        int Plr1Pts = 690;
        int Plr2Pts = 790;
        int Plr3Pts = 269;
        int Plr4Pts = 459;
        int TheBiggestNumber = 0;
        // Table where I put all the players points
        int myNumbers[] = { Plr1Pts, Plr2Pts, Plr3Pts, Plr4Pts };
        // Loop through the Table(array) and I check if is bigger than the last value
        for (int i : myNumbers) {
            int Number = i;
            if (Number > TheBiggestNumber) {
                TheBiggestNumber = Number;
            }
        }
        System.out.println("The Winner Has " + TheBiggestNumber + " POINTS!");
    }

}