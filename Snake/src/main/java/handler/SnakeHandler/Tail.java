package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

/**
 *
 */
public class Tail extends SnakeSegment {
    public static final String info = "JE SUIS UNE QUEUE ";

    public Tail(SnakeSegment previous) {
        //Tail always the last segment
        super(null, previous);
    }


    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info);
    }

    @Override
    public void handle(Request request) {

    }
}