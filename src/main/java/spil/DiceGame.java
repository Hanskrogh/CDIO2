package spil;

import java.io.IOException;
import java.util.Scanner;

/**
 * This is the core class which is starting the application.
 *
 * <p>
 *     This class is creating the Dice Cup and the 2 players.
 * </p>
 */
public class DiceGame {
    /**
     * Is a list for the players.
     */
    Player[] players;
    /**
     * Is a list of the fields.
     */
    Field[] fields;

    /**
     * This constructor is calling the method getPlayers, which is creating the players.
     */
    public DiceGame() {
        this.players = getPlayers();
    }

    /**
     * This method is starting the application.
     * @throws IOException Is used for...
     */
    public void startGame() throws IOException {



        //The game is running

        boolean gameFinished = false;

        while(!gameFinished){


            DiceCup diceCup = new DiceCup();

            diceCup.castDices();
            Field fieldLandedOn = FieldFactory.getField(diceCup.getTerningSum());
            System.out.printf("Du landede på felt: %s\n%s\n", fieldLandedOn.name, fieldLandedOn.fieldText);

            // Field Logic

        }
    }

    /**
     * This method is asking the player for the 2 players names, and then creating the 2 players.
     * @return Is returning the 2 new players.
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
}
