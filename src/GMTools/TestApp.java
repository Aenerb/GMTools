package GMTools;

/**
 * Created by aenerb on 5/29/2015.
 */

public class TestApp {

    public static void main(String[] args) {
        MagicItem itemOne = MagicItemFactory.getMinorItem();
        MagicItem itemTwo = MagicItemFactory.getMediumItem();
        MagicItem itemThree = MagicItemFactory.getMajorItem();

        System.out.println(itemOne.getItemType());
        System.out.println(itemTwo.getItemType());
        System.out.println(itemThree.getItemType());
    }
}
