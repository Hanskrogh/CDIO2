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
    public void startGame(Player... playerList) throws IOException {



        //spillet kører

        boolean gameFinished = false;

        while(!gameFinished){

            for (int i = 0; i<1; i++) {
                DiceCup diceCup = new DiceCup();
                System.out.print("Player 1: Tryk på enter for at kaste");
                System.in.read();

                diceCup.castDices();
                Field fieldLandedOn = FieldFactory.getField(diceCup.getTerningSum());
                System.out.printf("Du landede på felt: %s\n%s\n", fieldLandedOn.name, fieldLandedOn.fieldText);
                System.out.println();

                // Felt Logik
            }
            for (int i = 0; i<1; i++) {
                DiceCup diceCup = new DiceCup();
                System.out.print("Player 2: Tryk på enter for at kaste");
                System.in.read();

                diceCup.castDices();
                Field fieldLandedOn = FieldFactory.getField(diceCup.getTerningSum());
                System.out.printf("Du landede på felt: %s\n%s\n", fieldLandedOn.name, fieldLandedOn.fieldText);
                System.out.println();

                // Felt Logik
            }
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
