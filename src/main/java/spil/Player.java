package spil;

/**
 *
 * @since 1.0.1
 */
public class Player {
    private String name;
    private int point;

    /**
     *
     * @param name
     * @since 1.0.1
     */
    public Player(String name){
        this.name = name;
    }

    /**
     *
     * @return
     * @since 1.0.1
     */
    public int getPoint(){
        return point;
    }

    /**
     *
     * @param point
     * @since 1.0.1
     */
    public void addPoint(int point) {
        this.point += point;
    }

    /**
     *
     * @param point
     * @since 1.0.1
     */
    public void setPoint(int point) {
        this.point = point;
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
