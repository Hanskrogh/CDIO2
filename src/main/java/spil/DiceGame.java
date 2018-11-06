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

            /**
             *  Runs the game with turns swapping between the players, until the variable "gameFinished" is true.
             */
            for (int i = 0; i<players.length; i++) {
                DiceCup diceCup = new DiceCup();
                System.out.println("-----------------------------------------------------------");
                System.out.print(players[i].getName() + ": Tryk på enter for at kaste terningerne");
                System.in.read();

                System.out.println();
                diceCup.castDices();
                Field fieldLandedOn = FieldFactory.getField(diceCup.getTerningSum());
                System.out.printf("Du landede på felt: %s\n%s\n", fieldLandedOn.name, fieldLandedOn.fieldText);
                players[i].account.changeBalance(fieldLandedOn.value);
                System.out.println();
                System.out.println("Din balance er nu på " + players[i].account.balance);


                if (fieldLandedOn.getsAnotherTurn) {
                    i--;
                    continue;
                }

                if (players[i].account.balance >= 3000) {
                    gameFinished = true;
                    System.out.println(players[i].getName() + " vandt spillet! Tillykke!");
                    break;
                }
                    // stod kode her
            }

        }
    }

    /**
     *
     * @return
     * @since 1.0.1
     */
    static Player[] getPlayers() {
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
