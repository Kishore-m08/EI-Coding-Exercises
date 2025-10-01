package marsrover.direction;
import marsrover.core.Position;
class South implements Direction {
    public Direction turnLeft() { return new East(); }
    public Direction turnRight() { return new West(); }
    public Position move(Position pos) { return pos.move(0, -1); }
    public String getName() { return "South"; }
}
