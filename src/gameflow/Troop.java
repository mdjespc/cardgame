package gameflow;
import java.util.ArrayList;

public class Troop extends C_Parent_Class{
    public float troop_hp, troop_ad;
    public ArrayList<String> troop_dmgtype, troop_attributes;
    public boolean isInPlay;
    public Troop() {
        super();
    }

    public Troop(int cost, String region, String title, String description, String subtype, String rarity) {
        super(cost, region, title, description, subtype, rarity);
    }

    public Troop(int cost, String region, String title, String description, String subtype, String rarity,
                 float troop_hp, float troop_ad, ArrayList<String> troop_dmgtype, ArrayList<String> troop_attributes) {
        super(cost, region, title, description, subtype, rarity);
        this.troop_hp = troop_hp;
        this.troop_ad = troop_ad;
        this.troop_dmgtype = troop_dmgtype;
        this.troop_attributes = troop_attributes;
    }

    public float getTroop_hp() {
        return troop_hp;
    }

    public void setTroop_hp(float troop_hp) {
        this.troop_hp = troop_hp;
    }

    public float getTroop_ad() {
        return troop_ad;
    }

    public void setTroop_ad(float troop_ad) {
        this.troop_ad = troop_ad;
    }

    public ArrayList<String> getTroop_dmgtype() {
        return troop_dmgtype;
    }

    public void setTroop_dmgtype(ArrayList<String> troop_dmgtype) {
        this.troop_dmgtype = troop_dmgtype;
    }

    public ArrayList<String> getTroop_attributes() {
        return troop_attributes;
    }

    public void setTroop_attributes(ArrayList<String> troop_attributes) {
        this.troop_attributes = troop_attributes;
    }

    @Override
    public String toString() {
        return "Troop{" +
                "troop_hp=" + troop_hp +
                ", troop_ad=" + troop_ad +
                ", troop_dmgtype=" + troop_dmgtype +
                ", troop_attributes=" + troop_attributes +
                ", cost=" + cost +
                ", region='" + region + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", subtype='" + subtype + '\'' +
                ", rarity='" + rarity + '\'' +
                '}';
    }

    @Override
    public String prettify()
    {
        return "_______________\n|"+this.getCost()+"|            |\n_______________|\n|              |\n|             " +
                " |\n|              |\n|              |\n|              |\n|"+(int)(this.getTroop_ad())+"|___________|"+
                (int)(this.getTroop_hp())+"|";
    }
    public boolean isOffPlay(boolean override)
    {
        if(override)
            return true;
        if((int)(troop_hp) <= 0)
            return true;
        else{
            return false;
        }
    }

    public Troop strike(Troop target, boolean duel_target)
    {
        target.sustain(this);
        if(duel_target)
        {
            troop_hp = troop_hp - target.getTroop_ad();
            if(isOffPlay(false))
            {
                autodestroy();
            }

        }
        return this;
    }

    public Troop sustain(Troop attacker)
    {
        troop_hp = troop_hp - attacker.getTroop_ad();
        if(isOffPlay(false))
        {
            autodestroy();
        }
        return this;
    }

    public boolean autodestroy()
    {
        return true;
    }
}
