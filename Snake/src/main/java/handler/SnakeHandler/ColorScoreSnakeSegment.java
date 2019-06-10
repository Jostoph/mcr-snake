package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

import java.awt.*;

/**
 * 
 */
public class ColorScoreSnakeSegment extends ColorSnakeSegment {
    //TODO: information
    public static final String info = "JE SUIS UN SEGMENT de couleur ";


    public ColorScoreSnakeSegment(SnakeSegment previous, SnakeSegment next, Color color) {
        super(previous, next, color);
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