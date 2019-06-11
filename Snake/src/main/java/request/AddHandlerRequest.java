package request;

import handler.snakeHandler.SnakeSegment;

public class AddHandlerRequest implements Request {

    private SnakeSegment snakeSegment;

    public AddHandlerRequest(SnakeSegment snakeSegment) {
        this.snakeSegment = snakeSegment;
    }


    public SnakeSegment getHandler() {
        return snakeSegment;
    }

    @Override
    public RequestType getRequestType() {
        return RequestType.ADDHANDLERREQUEST;
    }
}
