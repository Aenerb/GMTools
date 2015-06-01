import java.util.HashMap;

/**
 * Created by aenerb on 5/31/2015.
 */
public class MagicItem {
    private int itemType;

    // private int itemID;
    // private int properties;
    // private int totalBonus;
    // private int basePrice;

    private static int[] weightsMinor = new int[]{4,5,35,2,35,10,9};

    /*
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    */

    public void setType(int iType) {
        this.itemType = iType;
    }

    public int getItemType() {
        return itemType;
    }

    public void determineType(int rollValue) {
        System.out.println("Roll result is: " + rollValue);
        int range_min = 0;
        for(int ndx = 0; ndx < weightsMinor.length; ++ndx) {
            int range_max = range_min + weightsMinor[ndx];
            if (rollValue < range_max) {
                setType(ndx + 1);
                break;
            }
            range_min = range_max;
        }
    }
}
