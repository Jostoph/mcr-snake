package handler;

import request.Request;


/**
 *
 */
public abstract class BaseHandler implements Handler {
    /**
     *
     */
    public Handler next;

    /**
     *
     */
    public Handler previous;


    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void setPrevious(Handler previous) {
        this.previous = previous;
    }

    @Override
    public void Handler(Request request) {

    }


}