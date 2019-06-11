package handler.snakeHandler;

import request.DisplayRequest;
import request.Request;

/**
 * the head of the snake
 */
public class Head extends SnakeSegment {
    //TODO: information
    public static final String info = "JE SUIS UNE TETE DE SERPENT";

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
    public void information(DisplayRequest request) {
        request.addinfo(info);
    }

    @Override
    public void handle(Request request) {

    }
}