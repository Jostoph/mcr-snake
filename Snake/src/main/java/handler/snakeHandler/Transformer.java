package handler.snakeHandler;

import request.DisplayRequest;
import request.Request;
import request.SimpleColorRequest;
import util.Util;

import java.awt.*;
import java.util.Random;

public class Transformer extends SnakeSegment {

    public Transformer(SnakeSegment next, SnakeSegment previous) {
        super(next, previous);
        shapeType = ShapeType.ROUND;
        color = Color.BLACK;
    }
    public Transformer() {
        super(null, null);
        shapeType = ShapeType.ROUND;
        color = Color.BLACK;
    }
    @Override
    public void handle(Request request) {
        switch (request.getRequestType()) {
            case DISPLAYREQUEST:
                ((DisplayRequest) request).addColor(this.color);
                ((DisplayRequest) request).addShapeType(this.shapeType);

                next().handle(request);
                break;
            case SIMPLECOLORREQUEST:
                Color c = ((SimpleColorRequest) request).getColor();
                ColorAdd colorAdd = new ColorAdd( (SnakeSegment) next(),(SnakeSegment)previous(), c);

                previous().setNext(colorAdd);
                next().setPrevious(colorAdd);
//                next().handle(request);


        }
    }
}