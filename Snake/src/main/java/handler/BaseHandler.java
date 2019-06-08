package handler;
import request.Request;


/**
 * 
 */
public class BaseHandler implements Handler {

    /**
     * Default constructor
     */
    public BaseHandler() {
    }

    /**
     * 
     */
    public Handler next;

    /**
     * 
     */
    public Handler previous;

    @Override
    public void setNext(Handler handler) {
        // TODO implement here
    }

    @Override
    public void Handler(Request request) {

    }



}