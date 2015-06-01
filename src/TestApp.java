/**
 * Created by aenerb on 5/29/2015.
 */


public class TestApp {
    public static void main(String[] args) {
        Dice rollerOne = new Dice();
        MagicItem myItem = new MagicItem();

        int rollOne = rollerOne.roll(100);
        myItem.determineType(rollOne);
        System.out.println("My item type is: " + myItem.getItemType());
    }
}
