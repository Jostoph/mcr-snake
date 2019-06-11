package handler.snakeHandler;

import request.DisplayRequest;
import request.Request;

/**
 *
 */
public class Tail extends SnakeSegment {

    public Tail(SnakeSegment previous) {
        //Tail always the last segment
        super(null, previous);
    }


    @Override
    public void handle(Request request) {

        switch (request.getRequestType()) {
            case DISPLAYREQUEST:
                ((DisplayRequest) request).addColor(this.color);
                ((DisplayRequest) request).addShapeType(this.shapeType);
                break;
        }
    }
}