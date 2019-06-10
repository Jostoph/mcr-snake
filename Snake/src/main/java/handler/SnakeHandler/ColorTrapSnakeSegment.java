package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

import java.awt.*;

/**
 *
 */
public class ColorTrapSnakeSegment extends ColorSnakeSegment {
    //TODO: information
    public static final String info = "JE SUIS UN SEGMENT COUNTDOWN de couleur ";

    public ColorTrapSnakeSegment(Color color) {
        super(color);
    }

    /**
     * @param request
     */
    public void Handle(Request request) {
        // TODO implement here
    }

    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info + color);
    }


}