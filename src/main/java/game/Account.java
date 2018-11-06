package game;

/**
 * This class is creating the balance for the player.
 */
public class Account {
    /**
     * Defines the balance.
     */
    public int balance = 0;

    /**
     * This method is setting the balance to a specific value.
     *
     * <p>
     *     If the balance is less than 0, then it sets the balance to 0.
     * </p>
     * @param balance Is a specific value to set the balance to.
     */
    Account(int balance) {
        if(balance <0) this.balance=0;
        this.balance = balance;
    }

    /**
     * This method is changing the balance with a specific value.
     * @param amount Is a specific value to change the balance with.
     */
    public void changeBalance (int amount){
        balance += amount;
    }


}
