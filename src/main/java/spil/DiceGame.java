package spil;

import java.io.FileNotFoundException;
import java.io.IOException;

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

    GameStringContainer stringContainer;

    /**
     * This constructor is calling the method getPlayers, which is creating the players.
     */
    public DiceGame() {
        try {
            stringContainer = new GameStringContainer("resources/DA_game_strings.txt");
        } catch (FileNotFoundException fnfException) {
            System.out.println("Could not find strings resource");
        }

        players = getPlayers();
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
            Field fieldLandedOn = FieldFactory.getField(diceCup.getFaceValue());


            // Field Logic

        }
    }

    /**
     * This method is asking the player for the 2 players names, and then creating the 2 players.
     * @return Is returning the 2 new players.
     */
    private Player[] getPlayers() {
        View.print(stringContainer.getString("give_player_name"), 1);
        String player1 = View.readString();

        View.print(stringContainer.getString("give_player_name"), 2);
        String player2 = View.readString();

        return new Player[] {
              new Player(player1),
              new Player(player2)
        };

    }
}
