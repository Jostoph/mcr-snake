package handler.snakeHandler;

import request.Request;

/**
 * the head of the snake
 */
public class Head extends SnakeSegment {

    /**
     * constructor, previous is always null
     *
     * @param next the next handler
     */
    public Head(SnakeSegment next) {
        // Head always first segment
        super(next, null);

    }


    @Override
    public void handle(Request request) {

    }
}