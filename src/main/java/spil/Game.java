package spil;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hanskrogh
 * @version 1.0.1
 */
public class Game {

    public static void main(String[] args) throws IOException  {
        DiceGame diceGame = new DiceGame();
        diceGame.startGame();
    }
}
