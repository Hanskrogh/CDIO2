package spil;

/**
 *
 * @since 1.0.1
 */
public class Account {
    public int balance = 0;

    Account(int balance) {
        if(balance <0) this.balance=0;
        this.balance = balance;
    }

    public void changeBalance (int amount){
        balance += amount;
    }


}
