package handler.snakeHandler;

import request.Request;

/**
 *
 */
public class Tail extends SnakeSegment {

    public Tail(SnakeSegment previous) {
        //Tail always the last segment
        super(null, previous);
    }


    @Override
    public void handle(Request request) {
        return;
    }
}