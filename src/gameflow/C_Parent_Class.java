package gameflow;

public abstract class C_Parent_Class implements Playable{
    public int cost;
    public String region;
    public String title;
    public String description;
    public String subtype;
    public String rarity;

    public C_Parent_Class(int cost, String region, String title, String description, String subtype, String rarity) {
        this.cost = cost;
        this.region = region;
        this.title = title;
        this.description = description;
        this.subtype = subtype;
        this.rarity = rarity;
    }

    public C_Parent_Class() {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void onPlay(){

    }
    public void onDeath(){

    }

    public String prettify()
    {
        return "";
    }
}


