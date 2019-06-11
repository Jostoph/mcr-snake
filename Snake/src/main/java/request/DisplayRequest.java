package request;

import handler.snakeHandler.ShapeType;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * this class represente a display request
 */
public class DisplayRequest extends Request {

    private List<Color> colors = new ArrayList<>();
    private List<ShapeType> shapesTypes = new ArrayList<>();

    public DisplayRequest() {
        super(RequestType.DISPLAYREQUEST);
    }

    public void addColor(Color color) {
        colors.add(color);
    }

    public void addShapeType(ShapeType shapeType) {
        shapesTypes.add(shapeType);
    }

    public List<Color> getColors() {
        return colors;
    }

    public List<ShapeType> getShapesTypes() {
        return shapesTypes;
    }
}
