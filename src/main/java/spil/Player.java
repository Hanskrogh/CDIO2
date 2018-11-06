package spil;

/**
 * This class is for creating the players.
 */
public class Player {
    /**
     * Defines the name of the player.
     */
    private String name;
    /**
     * Defines the Account as account.
     */
    Account account;

    /**
     * This method is setting a name for the player and creating an account for the player.
     * @param name Is used for defining the name of the player.
     */
    public Player(String name){
        this.name = name;
        account = new Account(1000);
    }

    /**
     * This method is used for seeing the name of the player.
     * @return Returning the name of the player.
     */
    public String getName() {
        return name;
    }
}
