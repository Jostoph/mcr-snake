package handler.snakeHandler;

import request.Request;

import java.awt.*;

public class Multiplicator extends SnakeSegment {

    private int multiplicator;

    /**
     * constructor
     *
     * @param next     the next handler
     * @param previous the setPrevious handler
     */
    public Multiplicator(SnakeSegment next, SnakeSegment previous, int multiplicator) {
        super(next, previous);
        shapeType = ShapeType.CIRCLE;
        color = Color.WHITE;
        this.multiplicator = multiplicator;
    }

    @Override
    public void handle(Request request) {

    }
}
