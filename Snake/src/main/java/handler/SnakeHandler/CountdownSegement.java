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
     *  default constructor
     * @param previous
     * @param next
     * @param count
     */
    public CountdownSegement(SnakeSegment previous, SnakeSegment next, int count) {
        super(previous, next);
        this.count = count;
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


}