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
    FieldFactory fieldFactory;

    /**
     *
     * @since 1.0.1
     */
    public DiceGame() {
        View.print("Press 1 for english");
        View.print("Tryk 2 for dansk");

        int i = 0;
        while (true) {
            i = View.readInt();
            if (i >= 1 && i <= 2) {
                break;
            }
            System.out.println("Invalid Input! Try again.");
        }

        String language = "";
        switch (i) {
            case 1: language = "EN"; break;
            case 2: language = "DA"; break;
        }

        try {
            stringContainer = new GameStringContainer(String.format("resources/%s_game_strings.txt", language));
        } catch (FileNotFoundException fnfException) {
            System.out.println("Kunne ikke finde DA_game_strings.txt filen under resourcer.");
        }

        fieldFactory = new FieldFactory(stringContainer);
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
                View.print("-------------------------------------------------------------------------------------------------------------------------");
                View.print(stringContainer.getString("cast_dice"), players[i].getName());
                System.in.read();

                System.out.println();
                diceCup.castDices();
                Field fieldLandedOn = fieldFactory.getField(diceCup.getFaceValue());

                View.print(stringContainer.getString("field_land"), fieldLandedOn.name);
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
