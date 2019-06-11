package handler.snakeHandler;

import handler.DoubleLinkedHandler;
import request.DisplayRequest;
import request.Request;
import request.RequestType;

import java.awt.*;


/**
 * this class implement a snake segment
 */
public abstract class SnakeSegment implements DoubleLinkedHandler {

    protected Color color;

    protected ShapeType shapeType;

    /**
     * the next handler
     */
    private DoubleLinkedHandler next;
    /**
     * the setPrevious handler
     */
    private DoubleLinkedHandler previous;


    /**
     * constructor
     *
     * @param next     the next handler
     * @param previous the setPrevious handler
     */
    public SnakeSegment(SnakeSegment next, SnakeSegment previous, Color color) {
        this.next = next;
        this.previous = previous;
        this.color = color;
    }

    public SnakeSegment(SnakeSegment next, SnakeSegment previous) {
        this.next = next;
        this.previous = previous;
    }

    @Override
    public void setNext(DoubleLinkedHandler next) {
        this.next = next;
    }

    @Override
    public DoubleLinkedHandler next() {
        return this.next;
    }

    @Override
    public DoubleLinkedHandler previous() {
        return previous;
    }

    @Override
    public void setPrevious(DoubleLinkedHandler previous) {
        this.previous = previous;
    }

    public Color getColor() {
        return color;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }
}