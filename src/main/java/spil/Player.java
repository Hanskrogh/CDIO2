package spil;

/**
 *
 * @since 1.0.1
 */
public class Player {
    private String name;
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
    public String getName() {
        return name;
    }
}
