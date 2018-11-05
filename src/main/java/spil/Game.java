package spil;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hans, Nicklas, Rasmus, Mathias, Jeppe and Anton.
 * @version 1.0.1
 */
public class Game {

    /**
     *
     * @param args
     * @throws IOException
     * @since 1.0.1
     */
    public static void main(String[] args) throws IOException  {
        DiceGame diceGame = new DiceGame();
        diceGame.startGame();
    }
}
