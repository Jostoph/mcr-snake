import handler.SnakeHandler.SnakeSegment;
import jdk.internal.net.http.common.Pair;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

/**
 * 
 */
public class SnakeManager {
    public class Coordinate{
        @Getter @Setter private int x;
        @Getter @Setter  private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    /**
     *
     */
    private List<Pair<SnakeSegment,Coordinate>> snake;
    private List<Pair< Edible,Coordinate>> edibles;

    /**
     * Default constructor
     */
    public SnakeManager() {
    }





}