package marsrover.direction;

import marsrover.core.Position;

public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    Position move(Position pos);
    String getName();
}
