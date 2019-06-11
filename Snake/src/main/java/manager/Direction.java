package manager;

/**
 * this enum represente all direction we have
 */
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
            return new Coordinate(0, 1);
        }
    },
    RIGHT {
        @Override
        public Coordinate toCoordinate() {
            return new Coordinate(1, 0);
        }
    };

    /**
     * give the coordonate correspond to direction
     *
     * @return coordonate
     */
    public abstract Coordinate toCoordinate();
}