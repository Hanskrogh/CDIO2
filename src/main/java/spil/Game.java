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
     * This method is for running the application.
     * @param args Something you need in order to run the application.
     * @throws IOException Is used for...
     */
    public static void main(String[] args) throws IOException  {
        DiceGame diceGame = new DiceGame();
        diceGame.startGame();
    }
}
