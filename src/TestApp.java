/**
 * Created by aenerb on 5/29/2015.
 */

public class TestApp {

    private static final int minorItem = 0;
    private static final int mediumItem = 1;
    private static final int majorItem = 2;

    public static void main(String[] args) {
        MagicItem itemOne = new MagicItem(minorItem);
        MagicItem itemTwo = new MagicItem(mediumItem);
        MagicItem itemThree = new MagicItem(majorItem);

        System.out.println(itemOne.getItemType());
        System.out.println(itemTwo.getItemType());
        System.out.println(itemThree.getItemType());
    }
}
