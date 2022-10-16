package gameflow;

public class Hand {
    final private int MAX_SIZE = 10;
    private C_Parent_Class[] cardsInHand;
    private int nElems;

    public Hand() {
        cardsInHand = new C_Parent_Class[MAX_SIZE];
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public C_Parent_Class[] getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(C_Parent_Class[] cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public int getnElems() {
        return nElems;
    }

    public void setnElems(int nElems) {
        this.nElems = nElems;
    }

    //Hand methods
    public C_Parent_Class add(C_Parent_Class newCard){
        cardsInHand[nElems++] = newCard;
        return newCard;
    }
    public C_Parent_Class removeByIndex(int index){
        C_Parent_Class removedCard = cardsInHand[index];
        cardsInHand[index] = null;
        for (int i = index; i < nElems; i++) {
            C_Parent_Class tmp = cardsInHand[i + 1];
            cardsInHand[i] = tmp;
        }
        nElems--;
        return removedCard;
    }
}
