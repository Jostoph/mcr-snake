package manager;

import handler.snakeHandler.*;
import manager.edible.Food;
import request.AddHandlerRequest;
import request.DisplayRequest;
import request.ShuffleRequest;
import request.SimpleColorRequest;
import util.Util;


import java.awt.*;
import java.util.*;


/**
 * this class manage the snake
 */
public class SnakeManager {

    private static SnakeManager instance = null;
    private static final int numberOfTurnBeforeAddEdible = 3;
    private int remainingTurnBeforeAddEdible;

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
        if (instance == null) {
            instance = new SnakeManager();
        }
        return instance;
    }

    /**
     * Default constructor
     */
    private SnakeManager() {
        boardHeight = 40;
        boardWidth = 40;

        snake.add(new Coordinate(boardWidth / 2, boardHeight / 2));
        snake.add(new Coordinate(boardWidth / 2 + 1, boardHeight / 2));

        //ajoute une tête
        head = new Head(new Tail(head));

        // add some base handlers to start the game
        head.handle(new AddHandlerRequest(new ColorAdd(Color.RED)));
        head.handle(new AddHandlerRequest(new ColorAdd(Color.GREEN)));

        direction = Direction.LEFT;

        displayRequest = new DisplayRequest();

        score = 0;
        speedMultiplicator = 1;
        alive = true;
    }

    private void addSnakeCoordinate() {
        snake.addFirst(new Coordinate(snake.getFirst().getX() + direction.toCoordinate().getX(),
                snake.getFirst().getY() + direction.toCoordinate().getY()));
    }

    private void move() {
        displayRequest = new DisplayRequest();
        head.handle(displayRequest);
        addSnakeCoordinate();


        while (displayRequest.getColors().size() < snake.size() - 2)
            snake.remove(snake.getLast());
    }


    public void nextTurn(Direction newDirection) {
        setDirection(newDirection);
        Coordinate nextPlace = new Coordinate(snake.getFirst().getX() + direction.toCoordinate().getX(),
                snake.getFirst().getY() + direction.toCoordinate().getY());
        addFood();

        System.out.println("next place is : " + nextPlace.getX() + ", " + nextPlace.getY());
        System.out.println("snake list is : \n");
        for (Coordinate c : snake) {
            System.out.println("x : " + c.getX() + ", y : " + c.getY());
        }

        if (food.containsKey(nextPlace)) {
            // C'est de la bouffe
            head.handle(this.food.get(nextPlace).getRequest());
            food.remove(nextPlace);
        }
        if (nextPlace.getX() < 0 || nextPlace.getX() > boardWidth ||
                nextPlace.getY() < 0 || nextPlace.getY() > boardHeight) {
            // Out of bond -> game over
            alive = false;
        } else if (snake.contains(nextPlace)) {
            // eating itself -> game over
            alive = false;
        } else {
            move();
        }

    }

    public LinkedList<Coordinate> getSnakeCoordinates() {
        return snake;
    }

    public Map<Coordinate, Food> getFoodMap() {
        return food;
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

    private void setDirection(Direction direction) {

        Direction impossible;

        switch (direction) {
            case UP:
                impossible = Direction.DOWN;
                break;
            case DOWN:
                impossible = Direction.UP;
                break;
            case LEFT:
                impossible = Direction.RIGHT;
                break;
            default:
                impossible = Direction.LEFT;
        }

        if (this.direction != impossible) {
            this.direction = direction;
        }
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

    public Head getHead() {
        return head;
    }

    public void addPoints(int points) {
        score += points;

        if (score < 0) {
            alive = false;
        }
    }

    public void remPoints(int points) {
        score -= points;

        if (score < 0) {
            alive = false;
        }
    }

    private void addFood() {
        Random random = new Random();

        if (food.size() < 20 && remainingTurnBeforeAddEdible-- == 0) {
            remainingTurnBeforeAddEdible = numberOfTurnBeforeAddEdible;
            Color color = Util.getRandomColor();

            int rnd = random.nextInt(100);

            Coordinate newCoordinate;
            do {
                newCoordinate = new Coordinate(random.nextInt(boardWidth), random.nextInt(boardHeight));
            } while (snake.contains(newCoordinate));
            if (rnd < 40) {
                food.put(newCoordinate, new Food(new SimpleColorRequest(color, 1), ShapeType.ROUND));
            } else if (rnd < 60) {
                food.put(newCoordinate, new Food(new AddHandlerRequest(new ColorAdd(color)), ShapeType.CIRCLE));
            } else if (rnd < 80) {
                food.put(newCoordinate, new Food(new AddHandlerRequest(new ColorSub(color, 4)), ShapeType.SQUARE));
            } else if (rnd < 90) {
                food.put(newCoordinate, new Food(new AddHandlerRequest(new ColorSpeed(color, 4)), ShapeType.TRIANGLE));
            } else if (rnd < 95) {
                food.put(newCoordinate, new Food(new AddHandlerRequest(new Multiplicator(5)), ShapeType.CIRCLE));
            } else {
                food.put(newCoordinate, new Food(new AddHandlerRequest(new Transformer()), ShapeType.ROUND));
            }
        }
    }
}