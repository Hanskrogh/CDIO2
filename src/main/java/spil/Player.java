package spil;

/**
 *
 * @since 1.0.1
 */
public class Player {
    private String name;
    private int money;

    /**
     *
     * @param name
     * @since 1.0.1
     */
    public Player(String name){
        this.name = name;
        new Account();
    }

    /**
     *
     * @return
     * @since 1.0.1
     */
    public int getMoney(){
        return money;
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
