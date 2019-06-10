package handler.inputValidator;

import handler.BaseHandler;
import request.InputRequest;

public abstract class InputValidator extends BaseHandler {



    @Override
    public abstract void Handler(InputRequest request);
}
