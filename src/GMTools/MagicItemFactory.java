package GMTools;

/**
 * Created by aenerb on 2/10/2016.
 */
public class MagicItemFactory {

    private static final int minorItem = 0;
    private static final int mediumItem = 1;
    private static final int majorItem = 2;

    public static MagicItem getMinorItem() {
        return new MagicItem("", minorItem, generateMinorItem());
    }

    public static MagicItem getMediumItem() {
        return new MagicItem("", mediumItem, generateMediumItem());
    }

    public static MagicItem getMajorItem() {
        return new MagicItem("", majorItem, generateMajorItem());
    }

    public static int generateMinorItem() {
        return Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMinor());
    }

    public static int generateMediumItem() {
        return Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMedium());
    }

    public static int generateMajorItem() {
        return Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMajor());
    }
}
