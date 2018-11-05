package spil;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @since 1.0.1
 */
public class DiceGame {
    Player[] players;

    /**
     *
     * @since 1.0.1
     */
    DiceGame() {
        this.players = getPlayers();
    }

    /**
     *
     * @throws IOException
     * @since 1.0.1
     */
    public void startGame() throws IOException {



        //spillet kører

        boolean gameFinished = false;

        while(!gameFinished){


            DiceCup diceCup = new DiceCup();




        }
    }

    /**
     *
     * @return
     * @since 1.0.1
     */
    private Player[] getPlayers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Indtast spiller 1");
        String player1 = s.nextLine();
        System.out.println("Indtast spiller 2");
        String player2 = s.nextLine();


        return new Player[] {
              new Player(player1),
              new Player(player2)
        };

    }

}
