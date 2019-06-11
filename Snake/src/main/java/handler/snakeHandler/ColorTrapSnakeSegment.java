package handler.snakeHandler;

import request.DisplayRequest;
import request.Request;

import java.awt.*;

/**
 *
 */
public class ColorTrapSnakeSegment extends ColorSnakeSegment {
    //TODO : christoph
    private static final String info = "JE SUIS UN SEGMENT COUNTDOWN de couleur ";

    /**
     * constructor
     *
     * @param next     next handler
     * @param previous setPrevious handler
     * @param color    the color of this specific segment
     */
    public ColorTrapSnakeSegment(SnakeSegment next, SnakeSegment previous, Color color) {
        super(next, previous, color);
    }

    @Override
    public void handle(Request request) {

    }

    //TODO : christoph
    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info + color);
    }


}