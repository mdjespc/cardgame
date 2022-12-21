package gameflow;

public class Hand {
    final private int MAX_SIZE = 10;
    private CardType[] cardsInHand;
    private int nElems;

    public Hand() {
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
}
