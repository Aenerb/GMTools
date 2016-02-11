package GMTools;

/**
 * Created by Elliot Brown on 5/31/2015.
 */

public class MagicItem {

    /**
     * Item Properties
     */
    private int itemType;
    private int itemRarity;
    private int specialProperty;
    private int totalBonus;
    private int basePrice;
    private String itemName;

    /** Default constructor.
     *  Disabled to prevent creation of items without properties.
     */
    private MagicItem(){}

    /**
     * Constructor for MagicItem
     * @param theName Name of the item
     * @param theItemType Type of the Item (weapon, sword, potion, etc.)
     * @param theRarity How rare the item is
     */
    public MagicItem(String theName, int theRarity, int theItemType) {
        itemName = theName;
        itemRarity = theRarity;
        itemType = theItemType;
    }

    /**
     * Implementing Getters
     */
    public int getItemType() {
        return itemType;
    }

    public int getItemRarity() {
        return itemRarity;
    }

    public int getSpecialProperty() {
        return specialProperty;
    }

    public int getTotalBonus() {
        return totalBonus;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getItemName() {
        return itemName;
    }


}
