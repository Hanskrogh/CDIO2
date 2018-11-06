package spil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * This is the class that starts the application.
 */
public class DiceGame {
    /**
     * Is a list that holds all the players.
     */
    Player[] players;
    /**
     * Defines GameStringContainer as stringContainer.
     */
    GameStringContainer stringContainer;

    /**
     * This method is creating a new GameStringContainer with a file path and calls the method getPlayers.
     */
    public DiceGame() {
        try {
            stringContainer = new GameStringContainer("resources/EN_game_strings.txt");
        } catch (FileNotFoundException fnfException) {
            System.out.println("Kunne ikke finde DA_game_strings.txt filen under resourcer.");
        }

        this.players = getPlayers();
    }

    /**
     * This method is for starting the game.
     *
     * <p>
     *     The method is running the application with turns.
     *     That means that one player is playing at a time.
     *     This method is also printing out the information for the player with the class view.
     * </p>
     *
     * @throws IOException Is used for...
     */
    public void startGame() throws IOException {

        //Game is running

        boolean gameFinished = false;

        while(!gameFinished){

            //Runs the game with turns swapping between the players, until the variable "gameFinished" is true.
            for (int i = 0; i<players.length; i++) {
                DiceCup diceCup = new DiceCup();
                View.print("-----------------------------------------------------------");
                View.print(stringContainer.getString("cast_dice"), players[i].getName());
                System.in.read();

                System.out.println();
                diceCup.castDices();
                Field fieldLandedOn = FieldFactory.getField(diceCup.getFaceValue());

                View.print(stringContainer.getString("field_land"));
                View.print(fieldLandedOn.fieldText);

                players[i].account.changeBalance(fieldLandedOn.value);

                View.print("");
                View.print(stringContainer.getString("balance"), players[i].account.balance);

                if (fieldLandedOn.getsAnotherTurn) {
                    i--;
                    continue;
                }

                if (players[i].account.balance >= 3000) {
                    gameFinished = true;
                    View.print(stringContainer.getString("player_win"), players[i].getName());
                    break;
                }
            }

        }
    }

    /**
     * This method is used for getting the players names.
     * @return Returning the players names.
     */
    Player[] getPlayers() {
        View.print(stringContainer.getString("amount_players"));
        int n = View.readInt();

        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            View.print(stringContainer.getString("give_player_name"), i+1);
            players[i] = new Player(View.readString());
        }

        return players;
    }
}
