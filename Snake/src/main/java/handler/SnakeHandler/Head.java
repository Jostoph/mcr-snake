package handler.SnakeHandler;

import handler.BaseHandler;
import handler.Handler;
import request.Request;

/**
 * 
 */
public class Head extends SnakeSegment {


    /**
     * @param previous the previous handler
     * @param next     the next handler
     */
    public Head(Handler previous, Handler next) {
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

    @Override
    public void display() {

    }
}