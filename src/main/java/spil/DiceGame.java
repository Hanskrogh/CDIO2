package spil;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @since 1.0.1
 */
public class DiceGame {
    Player[] players;
    Field[] fields;

    /**
     *
     * @since 1.0.1
     */
    public DiceGame() {
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

            diceCup.castDices();
            Field fieldLandedOn = FieldFactory.getField(diceCup.getTerningSum());
            System.out.printf("Du landede på felt: %s\n%s\n", fieldLandedOn.name, fieldLandedOn.fieldText);

            // Felt Logik

        }
    }

    /**
     *
     * @return
     * @since 1.0.1
     */
    private Player[] getPlayers() {
        View.print("Indtast spiller 1");
        String player1 = View.readString();
        View.print("Indtast spiller 2");
        String player2 = View.readString();


        return new Player[] {
              new Player(player1),
              new Player(player2)
        };

    }

    /**
     *
     * @return
     * @since 1.0.1
     */

}
