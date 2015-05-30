/**
 * Created by aenerb on 5/29/2015.
 */


public class TestApp {
    public static void main(String[] args) {
        Dice rollerOne = new Dice();
        Dice rollerTwo = new Dice();

        int rollOne = rollerOne.roll();
        System.out.println(rollOne);
        int rollTwo = rollerTwo.roll(4,12);
        System.out.println(rollTwo);
        int rollThree = rollerOne.roll(100);
        System.out.println(rollThree);

    }
}
