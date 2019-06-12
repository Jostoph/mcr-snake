package request;

import java.awt.*;

public class ShuffleRequest implements Request{


    @Override
    public RequestType getRequestType() {
        return RequestType.SHUFFLEREQUEST;
    }

    public Color getColor() {
        return Color.CYAN;
    }
}
