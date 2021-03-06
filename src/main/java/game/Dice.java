package game;

import java.util.Random;

/**
 * This class is for creating a dice.
 */
public class Dice {
    /**
     * We are defining Random as random.
     */
    Random random;
    /**
     * Defines the value.
     */
    int value = 1;
    /**
     * Defines the sides for the die with a final static so it can't be changed.
     */
    public final static int DiceSides = 6;

    /**
     * This constructor is creating a new random.
     */
    public Dice() {
        this.random = new Random();
    }

    /**
     * This method is used for rolling the die.
     * @return the value of the random roll.
     */
    public int roll() {
        random = new Random(random.nextInt());
        value = random.nextInt(DiceSides)+1;
        return value;
    }

    /**
     * This method is used for seeing the current value of the die.
     * @return Returning the value of the dice side.
     */
    public int getValue() { return value; }
}
