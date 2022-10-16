package gameflow;


import java.util.ArrayList;

public class cardgame {

    public static void main(String[] args)
    {
        String [] config = {
                "1",            //Cost
                "Nilfgaard",    //Class/Region
                "Midnight Priestess", //Title
                "NA", //Description
                "NA", //Subtype
                "Common", //Rarity
                "2",    //HP
                "1",    //AD
                "Holy", //DMG type
                "Supportive"  //Attributes

        };
        ArrayList<String> dmg_type = new ArrayList<String>();
        dmg_type.add(0, config[8]);
        ArrayList<String> attributes = new ArrayList<String>();
        attributes.add(0, config[9]);

        Troop t = new Troop(Integer.parseInt(config[0]), config[1], config[2], config[3], config[4], config[5],
                Float.parseFloat(config[6]), Float.parseFloat(config[7]), dmg_type, attributes);
        Troop t2 = new Troop(3, "Novigrad", "Alley Mason", "Whenever you equip an ally," +
                " forge it.", "NA", "Rare", 4, 3, dmg_type, attributes);
        System.out.println(t.toString());
        System.out.println(t.prettify());
        System.out.println(t2.toString());
        System.out.println(t2.prettify());
        //Combat Example
        System.out.println("COMBAT");
        t.strike(t2, true);
        System.out.println(t);
        System.out.println(t2);

    }


}
