package view;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class CustomJPanel extends JPanel {

    private int width;
    private int height;

    private BufferedImage buffer;

    public CustomJPanel(int width, int height) {
        this.width = width;
        this.height = height;
        clearImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
       g.drawImage(buffer, 0, 0, this);
    }

    @Override
    public Graphics getGraphics() {
        return buffer.getGraphics();
    }

    public void clearImage() {
        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = (Graphics2D) buffer.getGraphics();
        Rectangle2D bg = new Rectangle2D.Double(0,0,width,height);

        g2d.fill(bg);
    }
}
