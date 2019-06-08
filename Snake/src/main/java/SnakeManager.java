import lombok.Getter;
import lombok.Setter;


import java.util.List;
import java.util.Map;


/**
 *
 */
public class SnakeManager {
    public class Coordinate {
        @Getter @Setter private int x;
        @Getter @Setter private int y;


        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     *
     */
    private List<Coordinate> snake;
    private Map<Edible,Coordinate> edibles;

    /**
     * Default constructor
     */
    public SnakeManager() {
    }


}