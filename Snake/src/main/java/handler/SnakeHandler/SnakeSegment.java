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
public abstract class SnakeSegment extends BaseHandler implements Displayable {


    /**
     * @param previous the previous handler
     * @param next     the next handler
     */
    public SnakeSegment(Handler previous, Handler next) {
        super(previous, next);
    }

    /**
     * @param request
     */
    public void Handle(Request request) {
        if (request.getRequestType() == RequestType.DISPLAYREQUEST ){
            display();
        }
    }

}