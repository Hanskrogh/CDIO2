package spil;

import java.util.Random;

public class Dice {
    Random random;
    int vaule = 1;

    public final static int DiceSides = 6;

    public Dice() {
        this.random = new Random();
    }

    // Retunerer en værdi mellem 1-TerningSides
    public int cast() {
        random = new Random(random.nextInt());//tving ny random per kald
        vaule = random.nextInt(DiceSides)+1;
        return vaule;
    }

    public int getVaule() { return vaule; }
}
