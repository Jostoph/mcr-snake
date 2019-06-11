package Manager;

public enum Direction {
    UP {
        @Override
        public Coordinate toCoordinate() {
            return new Coordinate(0, -1);
        }
    },
    LEFT {
        @Override
        public Coordinate toCoordinate() {
            return new Coordinate(-1, 0);
        }
    },
    DOWN {
        @Override
        public Coordinate toCoordinate() {
            return new Coordinate(1, 0);
        }
    },
    RIGHT {
        @Override
        public Coordinate toCoordinate() {
            return new Coordinate(0, 1);
        }
    };

    public abstract Coordinate toCoordinate();
}
