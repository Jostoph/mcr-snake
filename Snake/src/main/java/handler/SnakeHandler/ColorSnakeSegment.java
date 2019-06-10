package handler.SnakeHandler;

import request.DisplayRequest;
import request.Request;

import java.awt.*;

/**
 *
 */
public class ColorSnakeSegment extends SnakeSegment {
    //TODO: information
    public static final String info = "JE SUIS UN SEGMENT de couleur ";

    /**
     *
     */
    public Color color;

    public ColorSnakeSegment(Color color) {

        this.color = color;
    }


    /**
     * @param request
     */
    public void Handle(Request request) {
        // TODO implement here
    }


    /**
     * @param color
     */
    public void HasSameColor(java.awt.Color color) {
        // TODO implement here + verivier si java.awt
    }

    @Override
    public void information(DisplayRequest request) {
        request.addinfo(info + color);
    }
}