package gameflow;


import java.util.ArrayList;

public class cardgame {

    public static void main(String[] args)
    {
        Deck D = new Deck();
        for(int i = 0; i < 30; i++)
        {
            Troop t = new Troop(i, "NA", "NA", "NA", "NA", i, "NA", "NA", "NA");
            D.insertBottom(t);
            t.toString();
        }
        D.shuffle();
        D.printDeck();
    }


}
