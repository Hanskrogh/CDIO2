package spil;

/**
 *
 * @since 1.0.1
 */
public class Player {
    private String name;
    private int money;
    Account account;

    /**
     *
     * @param name
     * @since 1.0.1
     */
    public Player(String name){
        this.name = name;
        account = new Account(1000);
    }

    /**
     *
     * @return
     * @since 1.0.1
     */
    public int getMoney() {
        Account.balance += fieldLandedOn.value;
    }

    /**
     *
     * @param money
     * @since 1.0.1
     */
    public void setMoney(int money) {
    }

    /**
     *
     * @return
     * @since 1.0.1
     */
    public String getName() {
        return name;
    }
}
