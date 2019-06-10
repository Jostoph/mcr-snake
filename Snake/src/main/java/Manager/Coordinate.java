package Manager;

import lombok.Getter;
import lombok.Setter;

public class Coordinate {
    @Getter
    @Setter
    private int x;
    @Getter
    @Setter
    private int y;


    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}