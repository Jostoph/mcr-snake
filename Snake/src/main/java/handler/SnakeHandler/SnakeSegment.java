package handler.SnakeHandler;

import handler.DoubleLinkedHandler;
import request.DisplayRequest;
import request.Request;
import request.RequestType;


/**
 *
 */
public abstract class SnakeSegment implements DoubleLinkedHandler {

    //TODO: pas sur que ca marche de caster dans une sous class les paramêtre
    private DoubleLinkedHandler next;
    private DoubleLinkedHandler previous;

    public SnakeSegment(SnakeSegment next, SnakeSegment previous) {
        this.next = next;
        this.previous = previous;
    }

    /**
     * @param request requete a Handle
     */
    @Override
    public void handle(Request request) {
        if (request.getRequestType() == RequestType.DISPLAYREQUEST) {
            information((DisplayRequest) request);
        }

    }

    @Override
    public void setNext(DoubleLinkedHandler next) {
        this.next = next;
    }

    @Override
    public DoubleLinkedHandler next() {
        return this.next;
    }

    @Override
    public DoubleLinkedHandler getPrevious() {
        return previous;
    }

    @Override
    public void setPrevious(DoubleLinkedHandler previous) {
        this.previous = previous;
    }

    //TODO: rename information
    public abstract void information(DisplayRequest request);
}