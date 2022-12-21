package gameflow;

public abstract class CardType implements Playable{
    public int cost;
    public String cardClass;
    public String title;
    public String description;
    public String subtype;

    public CardType(int cost, String cardClass, String title, String description, String subtype) {
        this.cost = cost;
        this.cardClass = cardClass;
        this.title = title;
        this.description = description;
        this.subtype = subtype;
    }

    public CardType() {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCardClass() {
        return cardClass;
    }

    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }


    public String toString()
    {
        return "";
    }
    public String prettify()
    {
        return "";
    }
}


