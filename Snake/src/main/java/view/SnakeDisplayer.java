package view;

import manager.SnakeManager;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SnakeDisplayer {

    private JFrame frame;
    private CustomJPanel panel;

    private Timer timer;
    private int speed;


    private int scale = 20;
    private SnakeManager snakeManager;

    public SnakeDisplayer() {
        speed = 500;

        timer = new Timer(speed, e -> update());
        timer.start();
        snakeManager = SnakeManager.getInstance();
        frame = new JFrame("Snake");
        frame.setSize(snakeManager.getBoardWidth() * scale, snakeManager.getBoardHeight() * scale);

        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("closing...");
                timer.stop();
                e.getWindow().dispose();
            }
        });

        panel = new CustomJPanel();

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
        // TODO
    }

    private void drawFood() {
        // TODO
    }
}
