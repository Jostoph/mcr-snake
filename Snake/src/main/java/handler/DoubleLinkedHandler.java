
package handler;

import request.Request;

/**
 * this interface contain all fonction than double linked handler have to implemente
 */
public interface DoubleLinkedHandler {

    /**
     * change the next handler
     *
     * @param next the next segment
     */
    void setNext(DoubleLinkedHandler next);

    /**
     * return the next handler
     *
     * @return the next handler
     */
    DoubleLinkedHandler next();

    /**
     * change the previous handler
     *
     * @param previous the setPrevious handler
     */
    void setPrevious(DoubleLinkedHandler previous);

    /**
     * return the setPrevious handler
     *
     * @return the setPrevious handler
     */
    DoubleLinkedHandler previous();

    /**
     * @param request request pass to the handle
     */
    void handle(Request request);


}