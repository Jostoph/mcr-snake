
package handler;

import request.Request;

/**
 *
 */
public interface DoubleLinkedHandler {

    /**
     * @param next
     */
    void setNext(DoubleLinkedHandler next);

    DoubleLinkedHandler next();

    DoubleLinkedHandler getPrevious();

    void setPrevious(DoubleLinkedHandler previous);


    /**
     * @param request
     */
    void handle(Request request);


}