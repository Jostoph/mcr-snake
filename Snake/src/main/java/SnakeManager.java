import handler.SnakeHandler.Head;
import handler.SnakeHandler.SnakeSegment;


import java.util.*;


/**
 *
 */
public class SnakeManager {


    /**
     *
     */
    //TODO: linkedList pour avoir getLast?
    private LinkedList<Coordinate> snake = new LinkedList<>();
    private Map<Edible, Coordinate> edibles = new HashMap<>();
    private Head head;
    //TODO: edit les tailles
    private static final int MAXBOARDWIDTH = 100;
    private static final int MAXBOARDLEGHT = 50;


    /**
     * Default constructor
     */
    public SnakeManager() {
        snake.add(new Coordinate(MAXBOARDLEGHT / 2, MAXBOARDWIDTH / 2));
        head = new Head(null, null);
    }

    void addSnakeSegmentCoordinate(SnakeSegment snakeSegment) {
        //TODO: nouvelle élement toujours a droite
        snake.add(new Coordinate(snake.getLast().getX() + 1, snake.getLast().getY()));

        SnakeSegment segment = head;
        while (segment.next() != null) {
            segment = segment.next();
        }
        segment.setNext(snakeSegment);
    }


}