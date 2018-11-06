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
     * @param args Is a string of arguments for running the code (Our code is not using any arguments).
     * @throws IOException This is an exception that might be thrown when attempting to read a line using Scanner. The IO exception will only be thrown in case an invalid stream is getting input (other than System.in)
     */
    public static void main(String[] args) throws IOException  {
        DiceGame diceGame = new DiceGame();
        diceGame.startGame();
    }
}
