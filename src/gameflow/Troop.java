package gameflow;
import java.util.ArrayList;

public class Troop extends CardType{
    public int troopPower;
    public String troopType;
    public String troopRange;
    public String troopLane;
    public boolean isInPlay;
    public Troop() {
        super();
    }

    public Troop(int cost, String cardClass, String title, String description, String subtype, int troopPower,
                 String troopType, String troopRange, String troopLane) {
        super(cost, cardClass, title, description, subtype);
        this.troopPower = troopPower;
        this.troopType = troopType;
        this.troopRange = troopRange;
        this.troopLane = troopLane;
    }

    public int getTroopPower() {
        return troopPower;
    }

    public void setTroopPower(int troopPower) {
        this.troopPower = troopPower;
    }

    public String getTroopType() {
        return troopType;
    }

    public void setTroopType(String troopType) {
        this.troopType = troopType;
    }

    public String getTroopRange() {
        return troopRange;
    }

    public void setTroopRange(String troopRange) {
        this.troopRange = troopRange;
    }

    public String getTroopLane() {
        return troopLane;
    }

    public void setTroopLane(String troopLane) {
        this.troopLane = troopLane;
    }

    public boolean isInPlay() {
        return isInPlay;
    }

    public void setInPlay(boolean inPlay) {
        isInPlay = inPlay;
    }

    @Override
    public String toString() {
        return "\nTroop{" +
                "\nTitle: '" + title + "\'" +
                "\nCost: " + cost +
                "\nPower: " + troopPower +
                "\nRange: " + troopRange +
                "\nLane: " + troopLane +
                "\nType: " + troopType +
                "\nClass:" + cardClass +
                "\nDescription='" + description + "\'" +
                "\nSubtype: '" + subtype + "\'}";
    }

    @Override
    public String prettify()
    {
        return "_______________\n|"+this.getCost()+"|            |\n_______________|\n|              |\n|             " +
                " |\n|              |\n|              |\n|              |\n|"+(int)(this.getCost())+"|___________|"+
                (int)(this.troopPower)+"|";
    }



    public boolean autodestroy()
    {
        return true;
    }
}
