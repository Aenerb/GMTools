/**
 * Created by aenerb on 5/29/2015.
 */

public class TestApp {
    public static void main(String[] args) {
        int minMedMaj = 1;

        System.out.println("My item type is: " + Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMinor()));
        switch(minMedMaj) {
            case 1:
                Dice.weightedRoll(Dice.roll(100), ItemLookupTables.getWeightsMinor());
                break;
        }
        /*switch(myItem.determineValue(rollerOne.roll(100))) {
            case 1:
                break;
            default:
                break;
        }*/
    }
}
