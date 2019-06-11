package handler.snakeHandler;

import request.Request;

import java.awt.*;

/**
 *
 */
public class ColorAdd extends SnakeSegment {

    /**
     * constructor
     *
     * @param next     the next handler
     * @param previous the setPrevious handler
     */
    public ColorAdd(SnakeSegment next, SnakeSegment previous, Color color) {
        super(next, previous, color);
        shapeType = ShapeType.CIRCLE;
    }

    public ColorAdd(Color color) {
        super(null, null, color);
        shapeType = ShapeType.CIRCLE;
    }

    @Override
    public void handle(Request request) {

    }
}