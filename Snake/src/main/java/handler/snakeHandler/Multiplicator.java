package handler.snakeHandler;

import manager.SnakeManager;
import request.DisplayRequest;
import request.MutiColorRequest;
import request.Request;
import request.SimpleColorRequest;

import java.awt.*;

public class Multiplicator extends SnakeSegment {

    private int multiplicator;

    /**
     * constructor
     *
     * @param next     the next handler
     * @param previous the setPrevious handler
     */
    public Multiplicator(SnakeSegment next, SnakeSegment previous, int multiplicator) {
        super(next, previous);
        shapeType = ShapeType.CIRCLE;
        color = Color.BLACK;
        this.multiplicator = multiplicator;
    }

    public Multiplicator(int multiplicator) {
        super(null, null);
        shapeType = ShapeType.CIRCLE;
        color = Color.BLACK;
        this.multiplicator = multiplicator;
    }

    @Override
    public void handle(Request request) {

        switch (request.getRequestType()) {
            case DISPLAYREQUEST:
                ((DisplayRequest) request).addColor(this.color);
                ((DisplayRequest) request).addShapeType(this.shapeType);
                break;
            case SIMPLECOLORREQUEST:
                ((SimpleColorRequest) request).setScore(((SimpleColorRequest) request).getScore() * multiplicator);
                break;

            case MULTICOLORREQUEST:
                for (Color color : ((MutiColorRequest) request).getColors()) {
                    ((MutiColorRequest) request).setScore(((MutiColorRequest) request).getScore() * multiplicator);
                }
                break;
        }

        next().handle(request);

    }
}