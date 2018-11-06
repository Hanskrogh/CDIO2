package spil;

import java.util.Random;

/**
 * This class is for creating a dice.
 */
public class Dice {
    Random random;
    int vaule = 1;

    public final static int DiceSides = 6;

    /**
     *
     */
    public Dice() {
        this.random = new Random();
    }

    /**
     *
     * @return the value between 1 dice side.
     */
    public int cast() {
        random = new Random(random.nextInt());//tving ny random per kald
        vaule = random.nextInt(DiceSides)+1;
        return vaule;
    }

    /**
     *
     * @return Returning the value of the dice side.
     */
    public int getVaule() { return vaule; }
}
