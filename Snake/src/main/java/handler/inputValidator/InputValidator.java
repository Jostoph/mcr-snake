package handler.inputValidator;

import handler.BaseHandler;
import request.InputRequest;

public abstract class InputValidator extends BaseHandler {


    public abstract void Handler(InputRequest request);
}
