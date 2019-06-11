package request;

import java.awt.*;

// note : can be of TYPE -> SIMPLECOLOR/MULTICOLOR/ADDCOLORADD/ADDCOLORSPEED/ADDCOLORSUB
public class ColoredRequest extends Request {

    private Color color;

    public ColoredRequest(RequestType requestType, Color color) {
        super(requestType);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
