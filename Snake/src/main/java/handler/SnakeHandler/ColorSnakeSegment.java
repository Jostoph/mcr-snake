package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

import java.awt.*;

/**
 * this class implement a color to a snake segment
 */
public class ColorSnakeSegment extends SnakeSegment {
    //TODO : christoph
    public static final String info = "JE SUIS UN SEGMENT de couleur ";

    /**
     * color of this specific segemnt
     */
    Color color;

    /**
     * constructor
     *
     * @param next     next handler
     * @param previous previous handler
     * @param color    the color of this specific segment
     */
    public ColorSnakeSegment(SnakeSegment next, SnakeSegment previous, Color color) {
        super(next, previous);
        this.color = color;
    }

    /**
     * test if a color is the same than segment's color
     * @param color color to test
     * @return true if is the same color
     */
    public boolean HasSameColor(java.awt.Color color) {
        return color == this.color;
        //TODO: tester
    }

    //TODO : christoph
    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info + color);
    }

    @Override
    public void handle(Request request) {

    }
}