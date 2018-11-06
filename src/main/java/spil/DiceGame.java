package spil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @since 1.0.1
 */
public class DiceGame {
    Player[] players;
    GameStringContainer stringContainer;

    /**
     *
     * @since 1.0.1
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
     *
     * @throws IOException
     * @since 1.0.1
     */
    public void startGame() throws IOException {

        //spillet kører

        boolean gameFinished = false;

        while(!gameFinished){

            /**
             *  Runs the game with turns swapping between the players, until the variable "gameFinished" is true.
             */
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
     *
     * @return
     * @since 1.0.1
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

    /**
     *
     * @return
     * @since 1.0.1
     */

}
