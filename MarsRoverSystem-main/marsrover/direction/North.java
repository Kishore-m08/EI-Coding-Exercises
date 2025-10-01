package marsrover.direction;

import marsrover.core.Position;

public class North implements Direction {
    public Direction turnLeft() { return new West(); }
    public Direction turnRight() { return new East(); }
    public Position move(Position pos) { return pos.move(0, 1); }
    public String getName() { return "North"; }
}
