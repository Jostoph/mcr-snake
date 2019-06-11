package handler.snakeHandler;

import request.AddHandlerRequest;
import request.DisplayRequest;
import request.Request;
import request.RequestType;

/**
 * the head of the snake
 */
public class Head extends SnakeSegment {

    /**
     * constructor, previous is always null
     *
     * @param next the next handler
     */
    public Head(SnakeSegment next) {
        // Head always first segment
        super(next, null);

    }


    @Override
    public void handle(Request request) {

        switch (request.getRequestType()) {
            case DISPLAYREQUEST:
                ((DisplayRequest) request).addColor(this.color);
                ((DisplayRequest) request).addShapeType(this.shapeType);
                break;
            case ADDHANDLERREQUEST:
                SnakeSegment tmp = ((AddHandlerRequest) request).getHandler();
                tmp.setPrevious(this);
                tmp.setNext(this.next());
                this.setNext(tmp);
                break;
        }

        next().handle(request);
    }
}