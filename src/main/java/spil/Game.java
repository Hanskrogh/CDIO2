package spil;

import java.util.Scanner;

/**
 *
 * @author hanskrogh
 * @version 1.0.1
 */
public class Game {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Indtast spiller 1:");
        String player1 = s.nextLine();
        System.out.println("Indtast spiller 2");
        String player2 = s.nextLine();

        try {
            DiceGame.newGame(
                    new Player(player1),
                    new Player(player2)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
