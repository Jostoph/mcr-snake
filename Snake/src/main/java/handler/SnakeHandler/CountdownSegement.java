package handler.SnakeHandler;

import handler.Handler;
import request.DisplayRequest;
import request.Request;
/**
 * 
 */
public class CountdownSegement extends SnakeSegment {
    //TODO: information
    public static final String info= "JE SUIS UN SEGMENT COUNTDOWN";

    /**
     *
     */
    private int count;



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
    public void information(DisplayRequest request) {
        request.addinfo(info);
    }

}