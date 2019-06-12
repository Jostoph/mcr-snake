package util;

import java.awt.*;
import java.util.Random;

public class Util {
    public static Color getRandomColor() {
        int rnd = new Random().nextInt(5);
        Color color = Color.RED;
        switch (rnd) {
            case 1:
                color = Color.RED;
                break;
            case 2:
                color = Color.BLUE;
                break;
            case 3:
                color = Color.GREEN;
                break;
            case 4:
                color = Color.YELLOW;
                break;
        }

        return color;
    }
}
