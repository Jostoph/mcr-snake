package manager;

import handler.snakeHandler.Head;
import handler.snakeHandler.Tail;
import manager.edible.Food;
import request.DisplayRequest;


import java.util.*;


/**
 * this class manage the snake
 */
public class  SnakeManager {

    private static SnakeManager instance = null;

    private LinkedList<Coordinate> snake = new LinkedList<>();
    private Map<Coordinate, Food> food = new HashMap<>();
    private Head head;
    private DisplayRequest displayRequest;

    private int boardWidth;
    private int boardHeight;

    private Direction direction;
    private int speedMultiplicator;

    private int score;
    private boolean alive;

    public static SnakeManager getInstance() {
        if(instance == null) {
            instance = new SnakeManager();
        }
        return instance;
    }

    /**
     * Default constructor
     */
    public SnakeManager() {
        //TODO: de base apparait au millieu
        // TODO : ajouter la coord de la queue ???
        boardHeight = 40;
        boardWidth = 40;

        snake.add(new Coordinate(boardWidth / 2, boardHeight / 2));
        //ajoute une tête
        head = new Head(new Tail(head));
        //TODO: de base se déplace vers la gauche
        direction = Direction.LEFT;

        displayRequest = new DisplayRequest();

        score = 0;
        speedMultiplicator = 1;
        alive = true;
    }

    private void addSnakeCoordinate() {
        //TODO: nouvelle élement toujours a droite
        snake.addFirst(new Coordinate(snake.getFirst().getX() + direction.toCoordinate().getX(),
                snake.getFirst().getY() + direction.toCoordinate().getY()));
    }

    private void move() {
        head.handle(displayRequest);
        addSnakeCoordinate();

        while (displayRequest.getColors().size() < snake.size() - 2)
            snake.remove(snake.getLast());
    }

    private void generateFood() {
        // TODO : add food to food list
        // TODO : need Fabrics
    }

    public void nextTurn() {
        //TODO: utilser avec direction
        Coordinate nextPlace = new Coordinate(snake.getFirst().getX() + direction.toCoordinate().getX(),
                snake.getFirst().getY() + direction.toCoordinate().getY());

        if(food.containsKey(nextPlace)){
            // C'est de la bouffe
            head.handle(this.food.get(nextPlace).getRequest());
        } else if(  nextPlace.getX() < 0 || nextPlace.getX() > boardWidth ||
                    nextPlace.getY() < 0 || nextPlace.getY() > boardHeight){
            // Out of bond -> game over
            alive = false;
        } else if( snake.contains(nextPlace)){
            // eating itself -> game over
            alive = false;
        } else {
            move();
        }

    }

    public DisplayRequest getDisplayRequest() {
        return displayRequest;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getSpeedMultiplicator() {
        return speedMultiplicator;
    }

    public void setSpeedMultiplicator(int speed) {
        speedMultiplicator = speed;
    }

    public void addPoints(int points) {
        score += points;

        if(score < 0) {
            alive = false;
        }
    }
}