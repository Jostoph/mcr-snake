package request;

import java.util.logging.Handler;

public class AddHandlerRequest implements Request {

    private Handler handler;

    public AddHandlerRequest(Handler handler) {
        this.handler = handler;
    }


    public Handler getHandler() {
        return handler;
    }

    @Override
    public RequestType getRequestType() {
        return RequestType.ADDHANDLERREQUEST;
    }
}
