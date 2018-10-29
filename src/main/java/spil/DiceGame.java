package spil;

import java.io.IOException;
import java.util.Scanner;

public class DiceGame {
    Player[] players;

    DiceGame() {
        this.players = getPlayers();
    }

    public void startGame() throws IOException {



        //spillet kører

        boolean gameFinished = false;

        while(!gameFinished){


            DiceCup diceCup = new DiceCup();




        }
    }

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
