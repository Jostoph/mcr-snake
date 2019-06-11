package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

/**
 *
 */
public class Head extends SnakeSegment {
    //TODO: information
    public static final String info = "JE SUIS UNE TETE DE SERPENT";

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