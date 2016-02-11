package GMTools;

/**
 * Created by Elliot Brown on 5/31/2015.
 */

public class MagicItem {

    private int itemType;
    private int specialProperty;
    private int totalBonus;
    private int basePrice;

    /**
     * Constructor for GMTools.MagicItem
     * @param rarity determines if the item is a Minor, Medium, or Major magic item.
     */
    public MagicItem(int rarity) {
        switch (rarity) {
            case 0:
                itemType = generateMinorItem();
                break;
            case 1:
                itemType = generateMediumItem();
                break;
            case 2:
                itemType = generateMajorItem();
        }
    }

    public int generateMinorItem() {
        return Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMinor());
    }

    public int generateMediumItem() {
        return Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMedium());
    }

    public int generateMajorItem() {
        return Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMajor());
    }

    public int getItemType() {
        return itemType;
    }
}
