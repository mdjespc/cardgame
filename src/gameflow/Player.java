package gameflow;

public class Player {
    public Hand playerHand;
    public Deck playerDeck;
    private int playerHitPoints;
    private int playerGold;
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

    public int getPlayerHitPoints() {
        return playerHitPoints;
    }

    public void setPlayerHitPoints(int playerHitPoints) {
        this.playerHitPoints = playerHitPoints;
    }

    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
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
        playerHitPoints = 30;
        playerGold = 0;
        return this;
    }

    public void draw(int count){
        for (int i = 0; i < count; i++){
            this.playerHand.add(this.playerDeck.removeByIndex(0));
        }
    }
}
