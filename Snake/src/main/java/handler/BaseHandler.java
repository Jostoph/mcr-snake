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

    /**
     * @param previous the previous handler
     * @param next     the next handler
     */
    public BaseHandler(Handler previous, Handler next) {
        this.previous = previous;
        this.next = next;
    }


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