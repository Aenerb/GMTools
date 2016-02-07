/**
 * Created by aenerb on 6/7/2015.
 */

public class ItemLookupTables {
    /**
     * The following tables match with the random item generation tables found in the Core Rulebook
     */
    private static int[] weightsMinor = new int[]{4,5,35,2,35,10,9};
    private static int[] weightsMedium = new int[]{10,10,10,10,10,15,3,15,17};
    private static int[] weightsMajor = new int[]{10,10,5,10,10,10,20,5,20};
    private static int[] armorMinor = new int[]{60,20,5,2,2,2,9};
    private static int[] armorMedium = new int[]{5,5,10,10,10,10,5,2,3,3,37};
    private static int[] armorMajor = new int[]{8,8,11,11,11,8,3,3,37};
    private static int[] weaponMinor = new int[]{};



    public static int[] getWeightsMinor() {
        return weightsMinor;
    }
    public static int[] getWeightsMedium() {return weightsMedium; }
    public static int[] getWeightsMajor() {return weightsMajor;}

}
