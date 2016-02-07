/**
 * Created by Elliot Brown on 5/31/2015.
 */

public class MagicItem {
    private int itemType;

    public int generateMinorItem {
        return Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMinor());
    };

    // private int itemID;
    // private int properties;
    // private int totalBonus;
    // private int basePrice;


    /*
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    */

    public int getItemType() {
        return itemType;
    }
}
