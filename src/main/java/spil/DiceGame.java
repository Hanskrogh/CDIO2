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
        fields = createFields();
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
    private Field[] createFields() {
        return new Field[] {
                null, // Man kan ikke slå 1 med 2 terninger!
                new Field("Tower", 250, "Du har fundet tårne, og finder gamle skatte. Du får 250 !"),
                new Field("Crater", -100, "Du faldt ned i et krater og mistede 100 :("),
                new Field("Palace Gates", 100, "Du kom til et palads! 100 til dig!"),
                new Field("Cold Desert", -20, "Du landede i en kold ørken. Øv! -20"),
                new Field("Walled City", 180, "Du fandt walled city! Du får 180"),
                new Field("Monastery", 0, "Du kom til monastery og fik ingenting"),
                new Field("Black Cave", -70, "Du befinder dig nu i en sort grotte, -70"),
                new Field("Huts in the mountain", 60, "Du fandt nogle små hytter på et bjerg! Og får 60!"),
                new Field("The Werewall (werewolf-wall)", -80, "Øv! Du kom til varulve grotten og mistede 80! Men du får en ekstra tur!", true),
                new Field("The pit", -50, "Du landede på the pit og mistede 50"),
                new Field("The goldmine", 650, "Du har fundet guld i bjergene og sælger det for 650, du er rig!"),
        };
    }
}
