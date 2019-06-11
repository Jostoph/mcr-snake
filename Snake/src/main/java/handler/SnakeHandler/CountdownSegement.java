package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

import java.awt.*;

/**
 * cette class implement a count segment when an eatable with same segement arrive the count downn
 * arrive at 0 the end of snake explose
 */
public class CountdownSegement extends ColorSnakeSegment {
    //TODO : christoph
    public static final String info = "JE SUIS UN SEGMENT COUNTDOWN";

    /**
     * the actual count
     */
    private int count;

    /**
     * constructor
     *
     * @param next     next handler
     * @param previous setPrevious handler
     * @param color    the color of this specific segment
     * @param count    the start count
     */
    public CountdownSegement(SnakeSegment next, SnakeSegment previous, Color color, int count) {
        super(next, previous, color);
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