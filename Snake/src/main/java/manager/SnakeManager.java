package manager;

import edible.Edible;
import handler.snakeHandler.Head;
import handler.snakeHandler.Tail;
import request.DisplayRequest;


import java.util.*;


/**
 * this class manage the snake
 */
public class SnakeManager {

    //TODO: linkedList pour avoir getLast?
    private LinkedList<Coordinate> snake = new LinkedList<>();
    private Map<Edible, Coordinate> edibles = new HashMap<>();
    private Head head;
    private DisplayRequest displayRequest = new DisplayRequest();
    //TODO: edit les tailles
    private static final int MAXBOARDWIDTH = 100;
    private static final int MAXBOARDLEGHT = 50;
    private Direction direction;

    /**
     * Default constructor
     */
    public SnakeManager() {
        //TODO: de base apparait au millieu
        snake.add(new Coordinate(MAXBOARDLEGHT / 2, MAXBOARDWIDTH / 2));
        //ajoute une tête
        head = new Head(new Tail(head));
        //TODO: de base se déplace vers la gauche
        direction = Direction.LEFT;
    }

    void addSnakCoordinate() {
        //TODO: nouvelle élement toujours a droite
        snake.addFirst(new Coordinate(snake.getFirst().getX() + direction.toCoordinate().getX(),
                snake.getFirst().getY() + direction.toCoordinate().getY()));
    }

    void move() {
        head.handle(displayRequest);
        addSnakCoordinate();

        while (displayRequest.getInformation().size() < snake.size() - 2)
            snake.remove(snake.getLast());
    }

    void nextTurn() {
        //TODO: utilser avec direction
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}