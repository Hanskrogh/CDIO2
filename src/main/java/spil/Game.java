package spil;

import java.io.IOException;

/**
 * Used for running the application.
 *
 * <p>
 *     Creates a new instance of the DiceGame-class. Starts the game by calling the startGame-method.
 * </p>
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
