package gameflow;


public class Deck {
    final private int MAX_SIZE = 60;
    private C_Parent_Class[] deckArray;

    private int nElems;

    public Deck() {
        this.deckArray = new C_Parent_Class[MAX_SIZE];
        nElems = 0;
    }

    /*
    Must receive an array of length 60 and the number of filled spots. Indices with no cards should be set to null.
     */
    public Deck(C_Parent_Class[] deckArray, int nCards) {
        this.deckArray = deckArray;
        nElems = nCards;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public C_Parent_Class[] getDeckArray() {
        return deckArray;
    }

    public void setDeckArray(C_Parent_Class[] deckArray) {
        this.deckArray = deckArray;
    }

    //Deck(Array) Methods
    public boolean isFull()
    {
        return nElems == MAX_SIZE;
    }
    //Add Methods
    public C_Parent_Class insertBottom(C_Parent_Class newCard) {
        if(isFull())
        {
            return newCard;
        }
        deckArray[nElems++] = newCard;
        return newCard;
    }
    //Remove Methods
    public C_Parent_Class removeBottom()
    {
        C_Parent_Class removedCard = deckArray[nElems-1];
        deckArray[--nElems] = null;
        return removedCard;
    }
    public C_Parent_Class removeByIndex(int index){
        C_Parent_Class removedCard = deckArray[index];
        deckArray[index] = null;
        for (int i = index; i < nElems; i++) {
            C_Parent_Class tmp = deckArray[i + 1];
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

}
