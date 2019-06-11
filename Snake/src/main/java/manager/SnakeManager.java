package manager;

import handler.snakeHandler.ColorAdd;
import handler.snakeHandler.Head;
import handler.snakeHandler.ShapeType;
import handler.snakeHandler.Tail;
import manager.edible.Food;
import request.AddHandlerRequest;
import request.DisplayRequest;
import request.Request;
import request.SimpleColorRequest;
import request.*;


import java.awt.*;
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
    private double speedMultiplicator;

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

    public int getScore() {
        return score;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public double getSpeedMultiplicator() {
        return speedMultiplicator;
    }

    public void setSpeedMultiplicator(double speed) {
        speedMultiplicator = speed;
    }

    public void incSpeedMultiplicator(double step) {
        speedMultiplicator += step;
    }

    public void addPoints(int points) {
        score += points;

        if(score < 0) {
            alive = false;
        }
    }

    public void remPoints(int points) {
        score -= points;

        if(score < 0) {
            alive = false;
        }
    }

    private void addFood () {
        Random random = new Random();

        if (food.size() < 10) {

            Integer rnd = random.nextInt(4);
            Color color = Color.RED;
            ShapeType shapeType;

            switch (rnd) {
                case 1: color = Color.RED;
                    break;
                case 2: color = Color.BLUE;
                    break;
                case 3: color = Color.GREEN;
                    break;
                case 4: color = Color.YELLOW;
                    break;
            }

            rnd = random.nextInt(10);

            if (rnd < 7) {
                shapeType = ShapeType.CIRCLE;
            } else if (rnd < 9) {
                shapeType = ShapeType.TRIANGLE;
            } else {
                shapeType = ShapeType.SQUARE;
            }

            rnd = random.nextInt(100);

            if (rnd < 91) {
                // todo, change stuff
                food.put(new Coordinate(random.nextInt(boardWidth), random.nextInt(boardHeight)),
                        new Food(new SimpleColorRequest(color,1), shapeType) );
            } else {
                food.put(new Coordinate(random.nextInt(boardWidth), random.nextInt(boardHeight)),
                        new Food(new AddHandlerRequest(new ColorAdd(color)), ShapeType.CIRCLE) ); // TOdo différencier
            }
            // Todo nique toi travis
        }
    }
}