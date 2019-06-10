package handler.SnakeHandler;

import handler.Handler;
import request.Request;
/**
 * 
 */
public class CountdownSegement extends SnakeSegment {

    /**
     *
     */
    private int count;

    /**
     * @param previous the previous handler
     * @param next     the next handler
     */
    public CountdownSegement(Handler previous, Handler next, int initialCount) {
        super(previous, next);
        this.count = initialCount;
    }

    /**
     * @param request
     */
    public void Handle(Request request) {
        // TODO implement here
    }

    /**
     * 
     */
    public void makeaction() {
        // TODO implement here
    }

    @Override
    public void setPrevious(Handler previous) {

    }

    @Override
    public void display() {

    }
}