package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

import java.awt.*;

/**
 * this implement a color segment with a score
 */
public class ColorScoreSnakeSegment extends ColorSnakeSegment {
    //TODO: information
    public static final String info = "JE SUIS UN SEGMENT de couleur ";

    /**
     * constructor
     *
     * @param next     next handler
     * @param previous setPrevious handler
     * @param color    the color of this specific segment
     */
    public ColorScoreSnakeSegment(SnakeSegment next, SnakeSegment previous, Color color) {
        super(next, previous, color);
    }

    public void Handle(Request request) {
        // TODO implement here
    }

    //TODO : christoph
    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info + color);
    }


}