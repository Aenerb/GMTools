import java.util.Random;

/**
 * Created by aenerb on 5/29/2015.
 */
public class Dice {

    /**
     * rng - Random Number Generator object.
     */
    private static Random rng = new Random();

    /**
     * Actual dice roller. Called by roll()
     * @param faces Max value (exclusive) of RNG.
     * @return random number between 1 and faces
     */
    private static int rollRand(int faces){
        return rng.nextInt(faces) + 1;
    }

    /**
     * Version One of roll() - rolls xDy
     * @param quantity number of dice
     * @param faces number of faces of die
     * @return combined total of roll
     */
    public static int roll(int quantity, int faces) {
        int rollResult=0;
        for (int roller = 0; roller < quantity; ++roller) {
            Random rng = new Random();
            int result = rollRand(faces);
            System.out.println("Roll xDy #" + (roller+1) + ":" + result);
            rollResult += result;
        }
        return rollResult;
    }

    /**
     * Version Two of roll() - roll 1Dy
     * @param faces number of faces of die
     * @return result of roll
     */
    public static int roll(int faces) {
        int roller = rollRand(faces);
        System.out.println("Roll 1D" + faces + ":" + roller);
        return roller;
    }

    /**
     * Version Three of roll() - roll 1D6
     * @return result of roll
     */
    public static int roll() {
        int roller = rollRand(6);
        System.out.println("Roll 1D6:" + roller);
        return roller;
    }
}
