package handler.snakeHandler;

import request.Request;

import java.awt.*;

public class Transformer extends SnakeSegment {

    public Transformer(SnakeSegment next, SnakeSegment previous) {
        super(next, previous);
        shapeType = ShapeType.ROUND;
        color = Color.BLACK;
    }

    @Override
    public void handle(Request request) {

    }
}