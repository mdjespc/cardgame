package gameflow;

public class Hand {
    final private int MAX_SIZE = 10;
    private CardType[] cardsInHand;
    private int nElems;

    public Hand() {
        nElems = 0;
        cardsInHand = new CardType[MAX_SIZE];
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public CardType[] getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(CardType[] cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public int getnElems() {
        return nElems;
    }

    public void setnElems(int nElems) {
        this.nElems = nElems;
    }

    //Hand methods
    boolean isEmpty()
    {
        return this.nElems == 0 && this.getCardsInHand()[0] == null;
    }

    public CardType add(CardType newCard){
        cardsInHand[nElems++] = newCard;
        return newCard;
    }
    public CardType removeByIndex(int index){
        CardType removedCard = cardsInHand[index];
        cardsInHand[index] = null;
        for (int i = index; i < nElems; i++) {
            CardType tmp = cardsInHand[i + 1];
            cardsInHand[i] = tmp;
        }
        nElems--;
        return removedCard;
    }

    public void printHand(){
        if(isEmpty()) {
            System.err.println("Hand is empty");
            return;
        }
        for(CardType C : this.getCardsInHand())
        {
            if(C instanceof Troop)
            {
                System.out.print(C.prettify());
            }
            else {
                //System.out.println(C.toString());
            }

        }
    }
}
