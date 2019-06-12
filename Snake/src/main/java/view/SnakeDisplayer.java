package view;

import handler.snakeHandler.ShapeType;
import manager.Coordinate;
import manager.Direction;
import manager.SnakeManager;
import manager.edible.Food;
import request.DisplayRequest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SnakeDisplayer {

    private JFrame frame;
    private CustomJPanel panel;

    private Timer timer;
    private int speed;

    private int width;
    private int height;
    private int scale = 20;
    private SnakeManager snakeManager;

    public SnakeDisplayer() {
        speed = 500;

        timer = new Timer(speed, e -> update());
        timer.start();
        snakeManager = SnakeManager.getInstance();
        frame = new JFrame("Snake");

        width = snakeManager.getBoardWidth() * scale;
        height = snakeManager.getBoardHeight() * scale;

        frame.setSize(width, height);

        // method on close window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("closing...");
                timer.stop();
                e.getWindow().dispose();
            }
        });

        // key listener for directions
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar() == 'w') {
                    snakeManager.setDirection(Direction.UP);
                } else if(e.getKeyChar() == 'a') {
                    snakeManager.setDirection(Direction.LEFT);
                } else if(e.getKeyChar() == 's') {
                    snakeManager.setDirection(Direction.DOWN);
                } else if(e.getKeyChar() == 'd') {
                    snakeManager.setDirection(Direction.RIGHT);
                }
            }
        });

        panel = new CustomJPanel(width, height);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void update() {

        snakeManager.nextTurn();
        if(!snakeManager.isAlive()) {

            System.out.println("Game Over");

            // update score and game over
            updateTitle("Game Over [ " + snakeManager.getScore() + " ]");

            timer.stop();
        } else {
            // update score
            updateTitle("[ " + snakeManager.getScore() + " ]");

            // update speed
            speed = (int) (speed * snakeManager.getSpeedMultiplicator());

            // clear panel
            panel.clearImage();

            // draw snake
            drawSnake();

            // draw food
            drawFood();

            // repaint frame
            frame.repaint();

            System.out.println("next");
        }
    }

    private void updateTitle(String title) {
        frame.setTitle("Snake - " + title);
    }

    private void drawSnake() {
        Graphics2D g2d = (Graphics2D) panel.getGraphics();
        DisplayRequest dr = snakeManager.getDisplayRequest();

        LinkedList<Coordinate> snakeList = snakeManager.getSnakeCoordinates();

        // draw head
        g2d.setColor(Color.BLACK);
        g2d.fillOval(snakeList.get(0).getX() * scale, snakeList.get(0).getY() * scale, 20, 20);

        // draw body
        drawSnakeBody(dr, g2d, snakeList);

        // draw tail
        g2d.setColor(Color.BLACK);
        g2d.fillOval(snakeList.getLast().getX() * scale, snakeList.getLast().getY() * scale, 20, 20);
    }

    private void drawFood() {
        Graphics2D g2d = (Graphics2D) panel.getGraphics();
        Map<Coordinate, Food> foodMap = snakeManager.getFoodMap();

        for(Coordinate c : foodMap.keySet()) {
            // TODO draw food
        }
    }

    private void drawSnakeBody(DisplayRequest dr, Graphics2D g2d, List<Coordinate> snakeList) {
        List<Color> colors = dr.getColors();
        List<ShapeType> shapeTypes = dr.getShapesTypes();

        System.out.println(snakeList.size() + " : snakecoord size");
        System.out.println(colors.size() + " : colors size");

        for(int i = 0; i < colors.size(); ++i) {
            g2d.setColor(colors.get(i));
            Coordinate c = snakeList.get(i + 1);
            int x = c.getX() * scale;
            int y = c.getY() * scale;
            ShapeType type = shapeTypes.get(i);

            switch (type) {
                case SQUARE:
                    g2d.fillRect(x, y, 20, 20);
                    break;
                case TRIANGLE:
                    g2d.fillRoundRect(x, y, 20, 20, 5, 5); // TODO not a triangle
                    break;
                case CIRCLE:
                    g2d.drawOval(x, y, 20,20);
                    break;
                default:
                    g2d.fillOval(x, y, 20,20);
            }
        }
    }
}
