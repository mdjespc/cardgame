package gameflow;

public class Player {
    public Hand playerHand;
    public Deck playerDeck;
    private int playerHP;
    private int playerFP;
    private boolean playerTurn;
    //TODO Action log


    public Player() {
    }

    public Player(Deck playerDeck) {
        this.playerDeck = playerDeck;
    }

    public Player(Hand playerHand, Deck playerDeck) {
        this.playerHand = playerHand;
        this.playerDeck = playerDeck;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public Deck getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(Deck playerDeck) {
        this.playerDeck = playerDeck;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public int getPlayerFP() {
        return playerFP;
    }

    public void setPlayerFP(int playerFP) {
        this.playerFP = playerFP;
    }

    public boolean isPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }

    //Player methods
    public Player initialize()
    {
        playerDeck = this.playerDeck.shuffle();
        playerHP = 30;
        playerFP = 0;
        return this;
    }

    public void draw(int count){
        for (int i = 0; i < count; i++){
            this.playerHand.add(this.playerDeck.removeByIndex(0));
        }
    }
}
