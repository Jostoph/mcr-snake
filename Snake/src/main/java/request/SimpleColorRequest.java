package request;

import java.awt.*;

public class SimpleColorRequest implements Request {

    private Color color;

    public SimpleColorRequest(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


    @Override
    public RequestType getRequestType() {
        return RequestType.SIMPLECOLORREQUEST;
    }
}
