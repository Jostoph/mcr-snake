package handler.snakeHandler;

import manager.SnakeManager;
import request.DisplayRequest;
import request.MutiColorRequest;
import request.Request;
import request.SimpleColorRequest;

import java.awt.*;

/**
 *
 */
public class ColorAdd extends SnakeSegment {

    /**
     * constructor
     *
     * @param next     the next handler
     * @param previous the setPrevious handler
     */
    public ColorAdd(SnakeSegment next, SnakeSegment previous, Color color) {
        super(next, previous, color);
        shapeType = ShapeType.CIRCLE;
    }

    @Override
    public void handle(Request request) {
        switch (request.getRequestType()) {
            case DISPLAYREQUEST:
                ((DisplayRequest) request).addColor(this.color);
                ((DisplayRequest) request).addShapeType(this.shapeType);
                break;
            case SIMPLECOLORREQUEST:
                if (((SimpleColorRequest) request).getColor() == this.getColor()) {
                    SnakeManager.getInstance().addPoints(((SimpleColorRequest) request).getScore());
                }
                break;

            case MULTICOLORREQUEST:
                for (Color color : ((MutiColorRequest) request).getColors()) {
                    if (color == this.getColor()) {
                        SnakeManager.getInstance().addPoints(((MutiColorRequest) request).getScore());
                        ((MutiColorRequest) request).getColors().remove(color);
                    }
                }
                break;


        }
        next().handle(request);
    }
}