package handler.snakeHandler;

import manager.SnakeManager;
import request.DisplayRequest;
import request.MutiColorRequest;
import request.Request;
import request.SimpleColorRequest;

import java.awt.*;

public class ColorSpeed extends SnakeSegment {

    private int countdown;

    /**
     * constructor
     *
     * @param next     the next handler
     * @param previous the setPrevious handler
     */
    public ColorSpeed(SnakeSegment next, SnakeSegment previous, Color color, int countdown) {
        super(next, previous, color);
        shapeType = ShapeType.TRIANGLE;
        this.countdown = countdown;
    }

    public ColorSpeed(Color color, int countdown) {
        super(null, null, color);
        shapeType = ShapeType.TRIANGLE;
        this.countdown = countdown;
    }


    @Override
    public void handle(Request request) {

        if (countdown == 0) {
            this.next().setPrevious(this.previous());
            this.previous().setNext(next());
            next().handle(request);
            return;
        }

        switch (request.getRequestType()) {
            case DISPLAYREQUEST:
                ((DisplayRequest) request).addColor(this.color);
                ((DisplayRequest) request).addShapeType(this.shapeType);
                break;
            case SIMPLECOLORREQUEST:
                if (((SimpleColorRequest) request).getColor() == this.getColor()) {
                    SnakeManager.getInstance().incSpeedMultiplicator(2);
                    countdown--;
                }
                break;

            case MULTICOLORREQUEST:
                for (Color color : ((MutiColorRequest) request).getColors()) {
                    if (color == this.getColor()) {
                        SnakeManager.getInstance().incSpeedMultiplicator(1 / countdown);
                    }
                }
                countdown--;
                break;
        }
        next().handle(request);


    }
}