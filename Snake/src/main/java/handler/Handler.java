package handler;

import request.InputRequest;
import request.Request;

/**
 *
 */
public interface Handler {

    /**
     * @param next
     */
    public void setNext(Handler next);

    /**
     * @param previous
     */
    public void setPrevious(Handler previous);

    /**
     * @param request
     */
    public void Handler(Request request);

    void Handler(InputRequest request);
}