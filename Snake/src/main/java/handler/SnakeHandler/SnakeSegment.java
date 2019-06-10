package handler.SnakeHandler;

import handler.BaseHandler;
import handler.Handler;
import request.Displayable;
import request.Request;
import request.RequestType;

import static request.RequestType.DISPLAYREQUEST;

/**
 * 
 */
public abstract class SnakeSegment extends BaseHandler{

    //TODO: pas sur que ca marche de caster dans une sous class les paramêtre
    private SnakeSegment next;
    /**
     * @param previous the previous handler
     * @param next     the next handler
     */
    public SnakeSegment(SnakeSegment previous, SnakeSegment next) {
        super(previous, next);
    }

    /**
     * @param request
     */
    public void Handle(Request request) {
        if (request.getRequestType() == RequestType.DISPLAYREQUEST ){
        }
    }


    public SnakeSegment next(){
        return this.next;
    }
}