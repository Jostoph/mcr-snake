package handler.SnakeHandler;

import handler.BaseHandler;
import request.DisplayRequest;
import request.Request;


/**
 *
 */
public abstract class SnakeSegment extends BaseHandler {

    //TODO: pas sur que ca marche de caster dans une sous class les paramêtre
    SnakeSegment next;


    /**
     * @param request requete a Handle
     */
    public void Handle(Request request) {
        if (request instanceof DisplayRequest) {
            information((DisplayRequest) request);
        }

    }


    public SnakeSegment next() {
        return this.next;
    }


    //TODO: rename information
    public abstract void information(DisplayRequest request);
}