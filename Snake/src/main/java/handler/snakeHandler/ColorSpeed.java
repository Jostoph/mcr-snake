package handler.snakeHandler;

import request.Request;

import java.awt.*;

public class ColorSpeed extends SnakeSegment {

    private int countdown;

    /**
     * constructor
     *
     * @param next     the next handler
     * @param previous the setPrevious handler
     */
    public ColorSpeed(SnakeSegment next, SnakeSegment previous, Color color, int countdown) {
        super(next, previous, color);
        shapeType = ShapeType.TRIANGLE;
        this.countdown = countdown;
    }

    @Override
    public void handle(Request request) {

    }
}
