package spil;

/**
 * This class is for creating the Player.
 *
 * <p>
 *
 * </p>
 */
public class Player {
    /**
     * Defines the players name.
     */
    private String name;
    /**
     * Defines the players points.
     */
    private int point;

    /**
     * The constructor for the player.
     * This method is called when needed to create a new player.
     * @param name Is for defining the Players name when creating a new player.
     */
    public Player(String name){
        this.name = name;
    }

    /**
     * This is method is used to see how many points the player has.
     * @return The players points is returned.
     */
    public int getPoint(){
        return point;
    }

    /**
     * This method is used for adding points to the players total amount of points.
     * @param point Is for adding a specific number of points to the players points.
     */
    public void addPoint(int point) {
        this.point += point;
    }

    /**
     * This method is used for setting the players points to any amount of points.
     * @param point Is for setting the players points to a specific amount of points.
     */
    public void setPoint(int point) {
        this.point = point;
    }

    /**
     * This method is used to see the players name.
     * @return The players name is returned.
     */
    public String getName() {
        return name;
    }
}
