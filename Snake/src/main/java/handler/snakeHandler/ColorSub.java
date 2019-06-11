package handler.snakeHandler;

import manager.SnakeManager;
import request.DisplayRequest;
import request.MutiColorRequest;
import request.Request;
import request.SimpleColorRequest;

import java.awt.*;

public class ColorSub extends SnakeSegment {

    private int countdown;

    /**
     * constructor
     *
     * @param next     the next handler
     * @param previous the setPrevious handler
     */
    public ColorSub(SnakeSegment next, SnakeSegment previous, Color color, int countdown) {
        super(next, previous, color);
        shapeType = ShapeType.SQUARE;
        this.countdown = countdown;
    }

    @Override
    public void handle(Request request) {
        switch (request.getRequestType()) {
            case DISPLAYREQUEST:
                break;
            case SIMPLECOLORREQUEST:
                if (((SimpleColorRequest) request).getColor() == this.getColor()) {
                    SnakeManager.getInstance().remPoints(((SimpleColorRequest) request).getScore());
                }
                break;

            case MULTICOLORREQUEST:
                for (Color color : ((MutiColorRequest) request).getColors()) {
                    if (color == this.getColor()) {
                        SnakeManager.getInstance().remPoints(((MutiColorRequest) request).getScore());
                    }
                }
                break;


        }
        next().handle(request);
    }
}