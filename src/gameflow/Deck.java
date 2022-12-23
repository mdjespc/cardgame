package gameflow;


public class Deck {
    final private int MAX_SIZE = 60;
    private CardType[] deckArray;

    private int nElems;

    public Deck() {
        this.deckArray = new CardType[MAX_SIZE];
        nElems = 0;
    }

    /*
    Must receive an array of length 60 and the number of filled spots. Indices with no cards should be set to null.
     */
    public Deck(CardType[] deckArray, int nCards) {
        this.deckArray = deckArray;
        nElems = nCards;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public CardType[] getDeckArray() {
        return deckArray;
    }

    public void setDeckArray(CardType[] deckArray) {
        this.deckArray = deckArray;
    }

    //Deck(Array) Methods
    public boolean isFull()
    {
        return nElems == MAX_SIZE;
    }
    //Add Methods
    public CardType insertBottom(CardType newCard) {
        if(isFull())
        {
            return newCard;
        }
        deckArray[nElems++] = newCard;
        return newCard;
    }
    //Remove Methods
    public CardType removeBottom()
    {
        CardType removedCard = deckArray[nElems-1];
        deckArray[--nElems] = null;
        return removedCard;
    }
    public CardType removeByIndex(int index){
        CardType removedCard = deckArray[index];
        deckArray[index] = null;
        for (int i = index; i < nElems; i++) {
            CardType tmp = deckArray[i + 1];
            deckArray[i] = tmp;
        }
        nElems--;
        return removedCard;
    }

    //Create a new shuffled deck
    public Deck shuffle(){
        Deck shuffledDeck = new Deck();
        while(nElems > 0){
            int index = (int)(Math.random()*nElems);
            shuffledDeck.insertBottom(this.removeByIndex(index));
        }
        return shuffledDeck;
    }

    public void printDeck()
    {
        System.out.println(nElems + " cards in deck\nMax Space: " + MAX_SIZE);
        for(CardType C : deckArray){
            if(C != null)
                System.out.println(C.toString());
    }
    }
}
