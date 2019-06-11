package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

/**
 *
 */
public class CountdownSegement extends SnakeSegment {
    //TODO : christoph
    public static final String info = "JE SUIS UN SEGMENT COUNTDOWN";

    /**
     *
     */
    private int count;

    public CountdownSegement(SnakeSegment next, SnakeSegment previous, int count) {
        super(next, previous);
        this.count = count;
    }

    //TODO : christoph
    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info);
    }

    @Override
    public void handle(Request request) {

    }
}