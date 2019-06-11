package manager.edible;

import handler.snakeHandler.ShapeType;
import request.Request;

public class Food {

    private Request request;
    private ShapeType shapeType;

    public Food(Request request, ShapeType shapeType) {
        this.request = request;
        this.shapeType = shapeType;
    }

    public Request getRequest() {
        return request;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }
}
