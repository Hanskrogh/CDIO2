package spil;

import java.util.Random;

/**
 *
 * @since 1.0.1
 */
public class Dice {
    Random random;
    int value = 1;

    public final static int DiceSides = 6;

    /**
     *
     * @since 1.0.1
     */
    public Dice() {
        this.random = new Random();
    }

    /**
     *
     * @return the value between 1 dice side.
     * @since 1.0.1
     */
    public int cast() {
        random = new Random(random.nextInt());//tving ny random per kald
        value = random.nextInt(DiceSides)+1;
        return value;
    }

    /**
     *
     * @return Returning the value of the dice side.
     * @since 1.0.1
     */
    public int getVaule() { return value; }
}
