package manager;

/**
 * this class implement a eulerien coordinate
 */
public class Coordinate {
    /**
     * abscissa
     */
    private int x;
    /**
     * ordered
     */
    private int y;

    /**
     * constructor
     *
     * @param x abscissa
     * @param y ordered
     */
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * abscissa getter
     *
     * @return abscissa
     */
    public int getX() {
        return x;
    }

    /**
     * abscissa setter
     *
     * @param x abscissa
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * ordered getter
     *
     * @return ordered
     */
    public int getY() {
        return y;
    }

    /**
     * ordered setter
     *
     * @param y ordered
     */
    public void setY(int y) {
        this.y = y;
    }
}