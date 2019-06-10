package handler.SnakeHandler;

import handler.BaseHandler;
import handler.Handler;
import request.Request;

/**
 * 
 */
public class Tail extends SnakeSegment {

    public Tail(SnakeSegment previous, SnakeSegment next) {
        super(previous, next);
    }

    /**
     * @param request
     */
    public void Handle(Request request) {
        // TODO implement here
    }


    @Override
    public void setPrevious(Handler previous) {

    }
}