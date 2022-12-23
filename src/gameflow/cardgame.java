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
            //t.toString();
        }
        //D = D.shuffle();
        //D.printDeck();
        Hand x = new Hand();
        Player p1 = new Player(x, D);
        p1.initialize();
        p1.playerHand = p1.createMulligan();
        p1.playerHand.printHand();
    }


}
