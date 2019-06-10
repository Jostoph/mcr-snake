package handler.SnakeHandler;

import request.Request;

import java.awt.*;

/**
 * 
 */
public class ColorSnakeSegment extends SnakeSegment {

    public ColorSnakeSegment(SnakeSegment previous, SnakeSegment next, Color color) {
        super(previous, next);
        this.color = color;
    }

    /**
     * 
     */
    public  Color color;

    /**
     * @param request
     */
    public void Handle(Request request) {
        // TODO implement here
    }


    /**
     * @param color
     */
    public void HasSameColor( java.awt.Color color) {
        // TODO implement here + verivier si java.awt
    }

}