package spil;

import java.util.Random;

public class DiceCup {
    private final Dice[] dices;

    public DiceCup() {
        dices = new Dice[] { new Dice(), new Dice() }; // der er altid kun 2 terninger (final)
    }

    // Kaster begge terninger og retunerer dette
    public int[] castDices() {
        int[] cast = new int[dices.length];

        // Her laver vi kastne
        for (int i = 0; i < dices.length; i++) {
            Dice dice = dices[i];
            cast[i] = dice.cast();
        }

        return cast;
    }

    public int getTerningSum() {
        int sum = 0;
        for (int i = 0; i < dices.length; i++) { sum += dices[i].getVaule(); }
        return sum;
    }

    public boolean erEns() {
        for (int i = 0; i < dices.length; i++) {
            for (int j = 0; j < dices.length; j++) {
                if (dices[i] != dices[j]) return false;
            }
        }
        return true;
    }
}
