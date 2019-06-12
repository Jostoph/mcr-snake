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

    public void setScore(int score) {
        this.score = score;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public RequestType getRequestType() {
        return RequestType.SIMPLECOLORREQUEST;
    }
}