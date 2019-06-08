package handler;

import request.Request;

/**
 * 
 */
public interface Handler {

    /**
     * @param handler
     */
    public void setNext(Handler handler);

    /**
     * @param request
     */
    public void Handler(Request request);

}