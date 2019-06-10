package handler.SnakeHandler;

import handler.BaseHandler;
import handler.Handler;
import request.DisplayRequest;
import request.Request;

/**
 *
 */
public class Tail extends SnakeSegment {
    public static final String info = "JE SUIS UNE QUEUE ";


    /**
     * @param request
     */
    public void Handle(Request request) {
        // TODO implement here
    }


    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info);
    }
}