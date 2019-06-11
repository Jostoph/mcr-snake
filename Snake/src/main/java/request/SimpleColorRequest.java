package request;

import java.awt.*;

public class SimpleColorRequest implements Request {

    private Color color;
    private int score;

    public SimpleColorRequest(Color color, int score) {
        this.color = color;
        this.score = score;
    }

    public Color getColor() {
        return color;
    }

    public int getScore() {
        return score;
    }

    @Override
    public RequestType getRequestType() {
        return RequestType.SIMPLECOLORREQUEST;
    }
}